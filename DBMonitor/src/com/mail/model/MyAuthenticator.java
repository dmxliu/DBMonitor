/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-25,下午03:45:50
 */
package com.mail.model;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;



/** 
 * @ClassName: MyAuthenticator 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-25 下午03:45:50 
 * 
 * @version 3.0.0 
 */
public class MyAuthenticator extends Authenticator {
 
	
	private String username ; 
	
	private String password ;

	public MyAuthenticator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
    protected PasswordAuthentication getPasswordAuthentication() {
		System.out.println("use:username :"+username +"password:"+password);
    return new PasswordAuthentication(username, password);

    }
	
	
}
