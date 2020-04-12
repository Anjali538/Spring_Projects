package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.model.Circle;

public class CoreExample {

	public static void main(String[] args) {
		
	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	ApplicationContext contex = new ClassPathXmlApplicationContext("spring.xml");
	//Triangle tr = (Triangle)contex.getBean("triangle1");
	//tr.draw();
	
	//Circle cr = (Circle)contex.getBean("circle");
	//cr.draw();
	
	System.out.println(contex.getMessage("name", null,"Default Name", null));
	
	}

}
