package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/collections/configCollections.xml");
		Employee objEmployee = (Employee) ac.getBean("emp");
		System.out.println(objEmployee);
	}

}
