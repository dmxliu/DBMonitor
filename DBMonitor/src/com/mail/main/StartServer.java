/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月9日,下午4:45:56
 */
package com.mail.main;

import org.apache.log4j.PropertyConfigurator;

import com.mail.services.DBServer;


/**
 * @author lyz
 * @date 2014年12月9日,下午4:45:56
 * @version 1.0.0
 * @Description: TODO
 */
public class StartServer {

	
	public static void main( String [] args ) {
		
		PropertyConfigurator.configure(Thread.class.getResource( "/" ).getPath()+"resource/log4j.properties");   
		DBServer server = new DBServer();
		server.execute( args );
	}
}
