package com.kh.test.customer.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private int customerNo;
	private String customerName;
	private String customerTel;
	private String customerAddress;
	
}
