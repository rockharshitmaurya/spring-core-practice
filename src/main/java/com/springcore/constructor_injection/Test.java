package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructor_injection/ciconfig.xml");
		Person objPerson = (Person) context.getBean("person");
		System.out.println(objPerson.toString());
	}

}
