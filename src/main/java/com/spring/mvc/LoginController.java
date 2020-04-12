package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8085/spring-mvc-orm-dao-aop/spring-mvc/hello
 */
@Controller
public class LoginController {

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {

		return "Hello Satyarth !";
	}

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String sayHello1() {

		return "login";
	}

	@RequestMapping(value = "/hello1", method = RequestMethod.POST)
	public String sayHello2(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name1", name);
		model.put("password", password);
		return "hello";
	}

}
