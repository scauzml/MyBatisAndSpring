package com.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.mapper.BookMapper;
import com.mybatis.model.Book;
import com.mybatis.service.BookService;
@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

}
