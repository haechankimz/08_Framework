package com.khc.book.bm.model.service;

import java.util.List;

import com.khc.book.bm.model.dto.Book;

public interface BookService {

	int bookInsert(Book inputBook);

	List<Book> selectBook();

	String searchBook(String searchTitle);


}
