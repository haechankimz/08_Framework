package com.kh.test.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int userNo;
	private String userId;
	private String userName;
	private int userAge;
	
}
