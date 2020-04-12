package com.java.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	/*@Before("execution(public String com.java.test.aop.Circle.getName())")
	public void loggingAdvice() {
		System.out.println("Advice Run Get method called");
	}
	
	@Before("execution(public * get*())")
	public void loggingAdvice1() {
		System.out.println("Advice Run Get method called");
	}*/
	
	
/*	@Before("allCircleClass()")
	public void loggingAdvice(JoinPoint joinPoint) {
		Circle circle = (Circle) joinPoint.getTarget();
		System.out.println("Circle : " + circle.getName() );
	}
	
	@After("args(name)")
	public void stringArgumentMethod(String name) {
		System.out.println("The method that takes String argument has been called :" + name );
	}
	*/
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before Advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	
//	@Pointcut("within(com.java.test.aop.Circle)")
//	public void allCircleClass() {
		
//	}
	
	

}
