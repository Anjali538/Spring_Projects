package com.spring.aop;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect
{

	@Before("execution(public * *())")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
        System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));
    }

	/*@Before("getNamePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }
     
    @Pointcut("execution(public * *())")
    public void getNamePointcut(){}
     */

	@Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }
	
	@Before("execution(* *())")
    public void afterGetNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }
	
	@Before("execution(public String getName(..))") //0 or more argument
    public void getNameAdvice1(){
        System.out.println("Executing Advice on getName() for //0 or more argument");
    }
	
	@Before("execution(public String getName(*))") //1 or more argument
    public void getNameAdvice2(){
        System.out.println("Executing Advice on getName() for //0 or more argument");
    }
	
	
}
