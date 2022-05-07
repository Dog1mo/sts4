package com.newlecture.web.controller.api;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(name="p", defaultValue = "1") Integer page) throws ClassNotFoundException, SQLException {
		
		//String p = request.getParameter("p");
		
		
		//List<Notice> list = service.getList(1, "title", "");
		
		return "notice.list";
	}

}
