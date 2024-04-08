package com.khc.book.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "common/main";
	}
	
	@GetMapping("/book/add")
	public String bookInsert() {
		return "common/bookInsert";
	}
	
	@GetMapping("/book/updateBook")
	public String bookUpdate() {
		return "common/bookUpdate";
	}
	
	

}
