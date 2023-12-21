package com.extramarks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ap1 = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) ap1.getBean("student1"); // setter injection check(value as a element)
		System.out.println(student1);

		ApplicationContext ap2 = new ClassPathXmlApplicationContext("config.xml");
		Student student2 = (Student) ap2.getBean("student2"); // value as attribute check
		System.out.println(student2);

		ApplicationContext ap3 = new ClassPathXmlApplicationContext("config.xml");
		Student student3 = (Student) ap3.getBean("student3"); // value in p:schema check
		System.out.println(student3);
	}
}
