/**Copyright 2014 lashou Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 1.0.0
 *
 * @date 2014年12月9日,下午5:46:01
 */
package com.mail.services;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.mail.model.DBConnection;
import com.mail.model.MailConfig;
import com.mail.model.MyAuthenticator;

/**
 * @author lyz
 * @date 2014年12月9日,下午5:46:01
 * @version 1.0.0
 * @Description: TODO
 */
public class MailSender {

	public static void main( String [] args ) {

		MailSender mailSender = new MailSender();

		try {
			mailSender.sendDBError("");
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * email.protocol=smtp email.host=211.151.144.200 email.port=25
	 * email.username=lashou_bi1 email.password=lsbi!@#$ email.auth=true
	 * email.sendpartial=true email.systemEmail=lashou_bi1@lashou-inc.com
	 */
	public void sendDBError(String args){

		try {
			Properties props = new Properties();
			props.put("mail.transport.protocol","smtp");
			props.put( "mail.smtp.host", MailConfig.host );
			props.put( "mail.smtp.port",  MailConfig.port);
			props.put( "mail.smtp.sendpartial",  "true");
			props.put("mail.smtp.auth", "true");
			
			Session session = Session.getInstance( props, new MyAuthenticator(
					MailConfig.username, MailConfig.password) );
			Message msg = new MimeMessage( session );
			Address from = new InternetAddress( MailConfig.username);
			msg.setText( "你好：\n	" + DBConnection.MY_URL + "数据库出现异常请及时处理 !!!\n	"+args );
			msg.setFrom( from );
			new InternetAddress();
			msg.setRecipients( Message.RecipientType.TO, InternetAddress.parse( MailConfig.ts ) ) ;
			new InternetAddress();
			msg.setRecipients( Message.RecipientType.CC, InternetAddress.parse( MailConfig.cs ) ) ;
			msg.setSubject( "数据库监控" );
			Transport.send( msg );
		} catch ( AddressException e ) {
			e.printStackTrace();
		} catch ( MessagingException e ) {
			e.printStackTrace();
		}
	}
}
