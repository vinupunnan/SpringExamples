package com.examples.spring.autowire;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutowireTest {

	public static  void main(String args[]){
		
		FileSystemXmlApplicationContext fContext  = new FileSystemXmlApplicationContext("autoconf.xml");
		Student student = (Student) fContext.getBean("student");
		System.out.println(student.getId());
		System.out.println(student.getHostel().getHostelName());
	}
}
