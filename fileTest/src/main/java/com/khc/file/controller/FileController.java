package com.khc.file.controller;

import org.springframework.stereotype.Controller;

import com.khc.file.model.service.FileService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FileController {

	private final FileService service;
}
