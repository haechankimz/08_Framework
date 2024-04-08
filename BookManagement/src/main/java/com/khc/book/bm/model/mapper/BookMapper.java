package com.khc.book.bm.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khc.book.bm.model.dto.Book;

@Mapper
public interface BookMapper {

	int bookInsert(Book inputBook);

	List<Book> selectBook();

	String searchBook(String searchTitle);


}
