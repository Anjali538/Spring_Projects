package com.spring.security;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebSecurity
@EnableWebMvc
@ComponentScan
/**
 * http://localhost:8085/spring-mvc-orm-dao-aop/spring-mvc/security/users
 * https://www.baeldung.com/spring-security-csrf 
 * 
 * tim(ADMIN) can not see 'users' page, similarly joe can not see 'admin' page.
 * 
 * WebSecurityConfigurerAdapter can configure for web application's security
 * using saml, oauth(type of filter only), http basic, form
 * 
 * 
 */
public class AppConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.err.println("In App Config.....");
		http.csrf().disable().authorizeRequests().antMatchers("/spring-mvc/security/users/**").hasRole("USER")// USER
																												// role
																												// can
																												// access
																												// /users/**
				.antMatchers("/spring-mvc/security/admin/**").hasRole("ADMIN")// ADMIN role can access /admin/**
				.antMatchers("/spring-mvc/security/quests/**").permitAll()// anyone can access /quests/**
				// .anyRequest().authenticated()//any other request just need authentication
				.and().httpBasic();// formLogin();// enable form/http basic login

	}

	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication().withUser("tim").password("123").roles("ADMIN").and().withUser("joe")
				.password("234").roles("USER");
	}

	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}