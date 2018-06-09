package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mybatis.model.User;

public interface UserMapper {

	@Select("select * from user where id=#{id} and name=#{name}")
	public User findWithIdAndName(@Param("id")Integer id,@Param("name") String name);
	
}
