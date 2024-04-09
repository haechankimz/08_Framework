package com.kh.test.user.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.test.user.model.dto.User;
import com.kh.test.user.model.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserMapper mapper;
	
	@Override
	public List<User> searchId(String searchId) {
		return mapper.searchId(searchId);
	}
}
