package com.khc.file.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khc.file.model.mapper.FileMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

	private final FileMapper mapper;
	
}
