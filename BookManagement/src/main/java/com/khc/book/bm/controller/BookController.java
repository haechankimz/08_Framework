package com.khc.book.bm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.khc.book.bm.model.dto.Book;
import com.khc.book.bm.model.service.BookService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("book")
public class BookController {

	private final BookService service;

	
	@GetMapping("insert")
	public String bookInsert(
		Book inputBook,
		RedirectAttributes ra) {
		
		int result = service.bookInsert(inputBook);
		
		String message = null;
		
		if(result > 0 ) {
			message = "등록 성공";
		} else {
			message = "등록 실패";
		}
		
		ra.addFlashAttribute("message", message);
		
		return "redirect:/";
	}
	
	
	@ResponseBody
	@GetMapping("selectBook")
	public List<Book> bookList() {
		return service.selectBook();
	}
	
	
	
	@ResponseBody
	@GetMapping("search")
	public String searchBook(
		@RequestParam("searchTitle") String searchTitle) {
		return service.searchBook(searchTitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
