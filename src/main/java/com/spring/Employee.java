package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Employee {
 
	@RequestMapping("/welcome")
	public ModelAndView demo_Method(){
		
		 ModelAndView mod= new ModelAndView("HelloPage");
		 mod.addObject("display", "This is my first Sprring MVC Projet");
		 return mod;
	}
	
}
