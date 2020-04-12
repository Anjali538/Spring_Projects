package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component // by using @component, no need to define in spring.xml..
public class Rectangle implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	@Autowired
	private Point point1;

	public void draw() {
		System.out.println("Hi Rectangle is drawn.." + point1.getX() + ", " + point1.getY());
		publisher.publishEvent(new MyEventToBePublished(this));
		System.err.println("********************************");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
}
