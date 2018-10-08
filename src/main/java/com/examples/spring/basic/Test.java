package com.examples.spring.basic;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		FileSystemXmlApplicationContext context =	new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld hello =(HelloWorld) context.getBean("helloWorld");
		hello.test();
		context.close();
	}

	
}
