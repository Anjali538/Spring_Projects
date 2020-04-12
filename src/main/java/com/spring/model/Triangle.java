package com.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Triangle implements InitializingBean, DisposableBean {
	private String name;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	@Resource(name = "circle") // or can use @Autowired also
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	// @Autowired
	public MessageSource messageSource;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Required // this annotation check for NPE at the bean creation time only. well before we
				// call this from our code.
	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@PostConstruct
	public void postInit() {
		System.err.println("SEQUENCE 1 : init by JSR\n");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("SEQUENCE 2 : init by implementing InitializingBean");
	}

	public void initT() {
		System.err.println("SEQUENCE 3 : init by configuring Spring xml");
	}

	public void destroyT() {
		System.err.println("destroy From Spring xml");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle Destroy");

	}

	@PreDestroy
	public void preDestroy() {
		System.err.println("JSR Predestroy");

	}

	public void draw() {
		System.out.println("The Traingle has been drawn..");
		if (messageSource != null) {
			System.out.println("success got the message source");
			System.out.println(messageSource.getMessage("name", null, null));
		} else
			System.out.println("false DID not get the message source..");

		System.err.println("Point A- " + getPointA().getX() + ", " + getPointA().getY());
		System.err.println("Point B- " + getPointB().getX() + ", " + getPointB().getY());
		System.err.println("Point C- " + getPointC().getX() + ", " + getPointC().getY());
		System.err.println("Circle Name- " + getCircle().getName());
	}

}
