package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Component @Controller @Service @Repository
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "Hello Index 1";
	}

//	@Override 
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~"); 
//		//mv.setViewName("/WEB-INF/view/index.jsp"); 
//		return mv; 
//	}

}
