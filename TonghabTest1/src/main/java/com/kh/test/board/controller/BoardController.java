package com.kh.test.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.test.board.model.dto.Board;
import com.kh.test.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;
	
	
	@GetMapping("search")
	public String searchTitle(
		@RequestParam("boardTitle") String boardTitle,
		Model model) {
		
		List<Board> boardList = service.searchTitle(boardTitle);
		
		model.addAttribute("boardList", boardList);
		
		String path = null;
		
		if(!boardList.isEmpty()) path = "searchSuccess";
		else path = "searchFail";
		
		return path;
		
	}
	
	
}

