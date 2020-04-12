package com.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Point implements ApplicationContextAware {
	ApplicationContext applicationContext;
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	int y;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

	public String getName() {
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		return ("App Aware from Point - " + triangle.getName());
	}

}
