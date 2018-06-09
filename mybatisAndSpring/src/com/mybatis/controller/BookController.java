package com.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybatis.model.Book;
import com.mybatis.service.BookService;

@Controller
public class BookController {

	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@RequestMapping(value="/main")
	public String main(Model model) {
	List<Book> bookslist=bookService.getAll();
	model.addAttribute("book_list",bookslist);
	return "main";
	
	}
}
