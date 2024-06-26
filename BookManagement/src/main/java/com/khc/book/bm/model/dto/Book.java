package com.khc.book.bm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookNo;
	private String bookTitle;
	private String bookWriter;
	private int price;
	private String regDate;

}
