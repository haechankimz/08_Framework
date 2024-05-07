package com.kh.test.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.test.customer.model.dto.Customer;
import com.kh.test.customer.model.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CustomerController {

	private final CustomerService service;
	
	@PostMapping("add")
	public String insertCustomer(
			Customer customer) {
		
		int result = service.insertCustomer(customer);
	
		return "result";
	}
	
}
