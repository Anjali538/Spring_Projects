package com.spring.aop;

import com.spring.model.Circle;
import com.spring.model.Triangle;

public class ShapeService {

	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	private Triangle triangle;

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
