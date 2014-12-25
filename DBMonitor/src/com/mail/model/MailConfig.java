/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月9日,下午5:48:06
 */
package com.mail.model;


/**
 * @author lyz
 * @date 2014年12月9日,下午5:48:06
 * @version 1.0.0
 * @Description: TODO
 */
public class MailConfig {

	/*
	 * Properties props = new Properties(); props.setProperty("mail.smtp.host",
	 * "smtp.126.com"); props.put("mail.smtp.auth", "true"); Session session =
	 * Session.getInstance(props, new MyAuthenticator("liuyazhou130@126.com",
	 * "286376568")); Message msg = new MimeMessage(session); Address send = new
	 * InternetAddress("liuyazhou130@126.com"); Address from = new
	 * InternetAddress("liuyazhou130@126.com"); msg.setContent("hello my mail "
	 * ,"test/plain"); msg.setFrom(from);
	 * msg.setRecipient(Message.RecipientType.TO, send);
	 * msg.setSubject("you must comply"); Transport.send(msg);
	 */

	public static final String host = "211.151.144.200";

	public static final String port = "25";

	public static final String username = "lashou_bi1@lashou-inc.com";

	public static final String password = "lsbi!@#$";

	public static final String ts = "qiqinghai@lashou-inc.com,wanggang3@lashou-inc.com,pengcheng@lashou-inc.com,liuyazhou@lashou-inc.com";
	
	public static final String cs = "yuanlicheng@lashou-inc.com";

}
