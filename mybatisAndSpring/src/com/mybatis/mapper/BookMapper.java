package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mybatis.model.Book;

public interface BookMapper {

	@Select("select * from tb_book")
	List<Book> findAll();
	
}
