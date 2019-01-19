package com.exmples.spring.scopes;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ScopeTest {
	
	public static void main(String args[]) {
		
		 String[] SPRING_CONFIG_FILES = new String[]{"scopes.xml", "scopes1.xml"};
		  
		
		FileSystemXmlApplicationContext context =	new FileSystemXmlApplicationContext(SPRING_CONFIG_FILES);
		//FileSystemXmlApplicationContext context2 =	new FileSystemXmlApplicationContext("scopes1.xml");
		/* Default scope singleton */
		Message msg = (Message)context.getBean("message");
		System.out.println(msg.getMessage());
		
//		Message msg1 = (Message)context.getBean("message");
//		msg1.setMessage("vinod");
//		System.out.println(msg1.getMessage());
//		System.out.println(msg.getMessage());
		
		
		
		
		
	}

	
}

