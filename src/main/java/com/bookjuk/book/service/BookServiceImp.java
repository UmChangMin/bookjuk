package com.bookjuk.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.book.dao.BookDao;

@Component
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;
}
