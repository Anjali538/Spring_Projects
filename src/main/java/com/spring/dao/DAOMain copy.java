package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.JdbcTemplateDao;

public class DAOMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcTemplateDao daoObj = (JdbcTemplateDao) ctx.getBean("daoClass", JdbcTemplateDao.class);
		
		System.err.println("***JDBC Template result, no. of employees = " + daoObj.getEmpCountUsingJdbcTemplate());
	

		System.out.println("***Boiler plate result, no. of employees = " + daoObj.getEmpCountUsingBoilerPlate());

		

	}
}
