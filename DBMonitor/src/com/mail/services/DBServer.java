/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月9日,下午4:46:13
 */
package com.mail.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mail.model.DBConnection;


/**
 * @author lyz
 * @date 2014年12月9日,下午4:46:13
 * @version 1.0.0
 * @Description: TODO
 */
public class DBServer {

	private static final Logger log = LoggerFactory.getLogger(DBServer.class);  
	public void execute(String args[] ){
		MailSender sender = new MailSender();
		int min = 5 ;
		if(args == null || args.length == 0){
		}else{
			min = Integer.parseInt(args[0]);
		}
		while(true){
			long stime = System.currentTimeMillis();
			Connection conn = null; 
			try {
				Class.forName( DBConnection.MY_DRIVER );
			} catch ( ClassNotFoundException e ) {
				e.printStackTrace();
				log.error( "加载数据库驱动包失败",e );
				continue;
			}
			Statement stmt;
			try {
				conn = DriverManager.getConnection(DBConnection.MY_URL,DBConnection.USER_NAME,DBConnection.PASSWORD);
				stmt = conn.createStatement();
				stmt.execute(DBConnection.TEST_SQL);
			} catch(SQLException e ){
				e.printStackTrace();
				sender.sendDBError( e.getMessage() );
				log.error( "数据库异常"+e.getMessage()  );
			}catch(Throwable e ){
				log.error( "数据库异常"+e.getMessage()  );
				sender.sendDBError( e.getMessage() );
			}finally{
				try {
					if(conn !=null){
						conn.close();
					}
				} catch ( Exception e ) {
					e.printStackTrace();
					log.error( "关闭数据库异常" );
				}
			}
			long etime = System.currentTimeMillis();
			log.info( "从连接数据到执行sql耗时："+(etime-stime)/1000 +"s" );
			try {
				Thread.sleep( min*60*1000 );
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
		}
		
	}
	
}
