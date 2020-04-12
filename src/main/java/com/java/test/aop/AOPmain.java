package com.java.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPmain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring1.xml");
		ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("Dummy Name");
		System.out.println(shapeService.getCircle().getName());
	}

}
