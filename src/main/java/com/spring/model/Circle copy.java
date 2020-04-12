package com.spring.model;

import javax.annotation.Resource;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Circle {
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private Point center;
	
	
	
	public Point getCenter() {
		return center;
	}
	@Resource(name ="point2")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Draw Method for Circle : " + getCenter().getX());
	}

}
