package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// need a controller method to show HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form"; // Spring MVC will add the /WEB-INF/view/helloworld-form.jsp
	}
	
	// need a controller method to process the HTML form
	// This is the HTML page that processes after you input ur data
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	
}
