package com.khc.book.bm.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khc.book.bm.model.dto.Book;
import com.khc.book.bm.model.mapper.BookMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
	
	private final BookMapper mapper;

	@Override
	public int bookInsert(Book inputBook) {
		return mapper.bookInsert(inputBook);
	}
	
	@Override
	public List<Book> selectBook() {
		return mapper.selectBook();
	}

	
	@Override
	public String searchBook(String searchTitle) {

		return mapper.searchBook(searchTitle);
	}

}
