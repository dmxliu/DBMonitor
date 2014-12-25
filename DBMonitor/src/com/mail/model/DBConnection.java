/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月9日,下午4:40:49
 */
package com.mail.model;


/**
 * @author lyz
 * @date 2014年12月9日,下午4:40:49
 * @version 1.0.0
 * @Description: TODO
 */
public class DBConnection {
	
//	public static final String MY_URL = "jdbc:mysql://127.0.0.1:3306/lashou";
//	
//	public static final String USER_NAME = "root";
//	
//	public static final String PASSWORD = "root";
//			
//	
//	public static final String MY_DRIVER = "com.mysql.jdbc.Driver";
//	
//	public static final String TEST_SQL = "SELECT * FROM T_DUAL ";
	public static final String MY_URL = "jdbc:oracle:thin:@10.168.5.55:1356:lashoudw";
	
	public static final String USER_NAME = "bi_user";
	
	public static final String PASSWORD = "slafjaoighahd";
			
	
	public static final String MY_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	public static final String TEST_SQL = "SELECT * FROM DUAL ";
	
	
}
