package com.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * https://spring.io/guides/gs/batch-processing/
 * https://docs.spring.io/spring-batch/3.0.x/reference/html/spring-batch-intro.html
 * 
 * Can be used to process - automated, complex processing of large volumes of
 * information. e.g. month-end calculations.
 * Batch processing is used to process billions of transactions every day for enterprises.
 * 
 * Spring Batch is not a scheduling framework. There are many good enterprise
 * schedulers available in both the commercial and open source spaces such as
 * Autosys, cron, Quartz, Tivoli, Control-M, etc. 
 * Spring Batch is intended to work in conjunction with a scheduler, not replace a scheduler.
 */
@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class })
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
