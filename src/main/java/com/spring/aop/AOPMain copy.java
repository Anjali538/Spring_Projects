package com.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Triangle;

public class AOPMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		// ApplicationContext cntxt = new ClassPathXmlApplicationContext("spring.xml");

		ctx.registerShutdownHook();	
		ShapeService shapeService = (ShapeService) ctx.getBean("shapeService", ShapeService.class);
		Triangle trn = (Triangle) ctx.getBean("triangle", Triangle.class);
		// shapeService.getCircle().getName();
		trn.getName();

	}

}
