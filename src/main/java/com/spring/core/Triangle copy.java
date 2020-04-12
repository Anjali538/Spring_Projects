package com.spring.core;

import java.util.List;

public class Triangle {

	private Point ponitA;
	private Point ponitB;
	private Point ponitC;
	//private List<Point> points;

	 /*public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}*/

	public Point getPonitA() {
		return ponitA;
	}

	public void setPonitA(Point ponitA) {
		this.ponitA = ponitA;
	}

	public Point getPonitB() {
		return ponitB;
	}

	public void setPonitB(Point ponitB) {
		this.ponitB = ponitB;
	}

	public Point getPonitC() {
		return ponitC;
	}

	public void setPonitC(Point ponitC) {
		this.ponitC = ponitC;
	}

	public void draw() {
	//	for(Point a : points) {
	//	System.out.println(a.getX() + a.getY() + "-------");
	//	}
		System.out.println("Point A = " + getPonitA().getX() + "Point B = " + getPonitB().getY()+ "Point C" + getPonitC().getX() );
	}

}
