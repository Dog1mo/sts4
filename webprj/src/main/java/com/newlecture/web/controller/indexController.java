package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @Component @Controller @Service @Repository
public class indexController {

	@RequestMapping("/index")
	public void a() {
	
	}

	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception { ModelAndView mv = new
	 * ModelAndView("root.index"); mv.addObject("data", "Hello Spring MVC~");
	 * //mv.setViewName("/WEB-INF/view/index.jsp"); return mv; }
	 */
}
