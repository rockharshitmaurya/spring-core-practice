package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standalone_config.xml");

		Person obj = (Person) applicationContext.getBean("person1");
		System.out.println(obj.getFeestructure().getClass().getName());
		System.out.println(obj);
	}

}
