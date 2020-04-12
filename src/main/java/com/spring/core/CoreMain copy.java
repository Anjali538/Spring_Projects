package com.spring.core;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.model.Point;
import com.spring.model.Rectangle;

/**
 * 
 * https://www.youtube.com/watch?v=g15RcFyEcrk&list=PLGibysfsUS7NAbefiaj1V4LbX0glTftDI&index=7
 * </br>
 * we can wire beans depending on type and also depending on name beacuse that's the second guess
 * if it find multiple bean of the same type it also look into the name and other qlue we are providing is the qualifier
 * if multiple bean with same type then we are assiging thequalifier and if we are finding the qualifier.
 * 
 * AutowiredAnnotationBeanPostProcessor do all work of auto wired.
 * 
 * @Required id used to ignore null point exception if we use this annotation then proper exception  will come and we can easily debugg .
 *  
 * These additional annontations can be used in Spring Framework. activated by
 * <h1>context:annotation-config</h1> 
 * JSR 250 Annotations (not specif to spring it is javaX annotaion: @Resource (it do dependency injection by name), 
 * @PostConstruct (initilize bean without using config spring -xml), 
 * @PreDestroy (destroy bean after using registershutdownhook()</br>
 * Spring : 			 @Required, @Autowired </br>
 * JAX-WS : 			 @WebServiceRef</br>
 * EJB3 : 				 @EJB </br>
 * JPA : 				 @PersistenceContext, @PersistenceUnit </br>
 * 
 * Spring Stereotypes annontations activated by
 * <h1>context:component-scan</h1>
 * @Component, @Repository, @Service, @Controller, @Index </br>
 * </br>
 * <li>Spring automatically scans and identifies all these classes that are
 * annotated with stereotype annotations and registers BeanDefinition with
 * ApplicationContext. technically the core purpose is same. Major difference
 * between these stereotypes is they are used for different .
 * 
 * @Component � generic and can be used across application.
 * @Service � annotate classes at service layer level.
 * @Controller � annotate classes at presentation layers level, mainly used in
 *             Spring MVC.
 * @Repository � annotate classes at persistence layer, which will act as
 *             database repository.</li>
 *
 *Also see examples for -
 *Localizationclassification
 *Events
 *Intercepters
 *Filter
 *Security
 *Websockets
 *HTML5
 *spring-cloud-gateway : https://www.baeldung.com/spring-cloud-gateway
 *Actuator
 *Spring-Batch
 */
public class CoreMain {

	public static void main(String[] args) {

/*		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
*/		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		System.err.println("properties file read - " + context.getMessage("name", null, null));

		System.err.println("properties file read 2- " + context.getMessage("name", null, new Locale("fr")));

		Rectangle rectangleObj = (Rectangle) context.getBean("rectangle");
		rectangleObj.draw(); // publishes an event as well

		Point point = (Point) context.getBean("myFoo");
		System.err.println("Point name = "+point.getName());
		
		context.registerShutdownHook();

	}
	
}
