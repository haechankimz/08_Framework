package com.kh.test.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.test.user.model.dto.User;
import com.kh.test.user.model.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserService service;
	
	@GetMapping("search")
	public String searchId(
		@RequestParam("searchId") String searchId,
		Model model){
		
		List<User> userList = service.searchId(searchId);
		
		model.addAttribute("userList", userList);
		
		String path = null;
		
		if(!userList.isEmpty()) {
			path = "searchSuccess";
		}else {
			path = "searchFail";
		}
		return path;
	}
	
	
}
