package com.simojelloun.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/index", "/home"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
	}

//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
//		ModelAndView mv = new ModelAndView("page");
//		
//		if (StringUtils.isEmpty(greeting)) {
//			greeting = "Default value";
//		}
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
	@RequestMapping(value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting") String greeting) {		ModelAndView mv = new ModelAndView("page");
		
		if (StringUtils.isEmpty(greeting)) {
			greeting = "Default value";
		}
		mv.addObject("greeting", greeting);
		return mv;
	}
}
