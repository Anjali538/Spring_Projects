package com.spring.model;

import org.springframework.context.ApplicationEvent;

public class MyEventToBePublished extends ApplicationEvent {

	public MyEventToBePublished(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Event Name : Draw";
	}

}
