package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
}
