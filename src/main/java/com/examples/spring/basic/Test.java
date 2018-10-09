package com.examples.spring.basic;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		FileSystemXmlApplicationContext context =	new FileSystemXmlApplicationContext("beans.xml");
		
//		HelloWorld hello =(HelloWorld) context.getBean("helloWorld");
//		hello.test();
//		
//		Person p = (Person) context.getBean("person");
//		System.out.println(p.toString());

		User user = (User) context.getBean("user");
		System.out.println("Car Detauls is as follows" +user.getCar().toString());
		
		
		
		
		context.close();
	}

	
}
