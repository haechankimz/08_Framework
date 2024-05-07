package com.kh.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.test.model.dto.Student;
import com.kh.test.model.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentController {

	private final StudentService service;
	
	@ResponseBody
	@GetMapping("selectStudent")
	public List<Student> selectStudent(){
		return service.selectStudent();
	}
	
}
