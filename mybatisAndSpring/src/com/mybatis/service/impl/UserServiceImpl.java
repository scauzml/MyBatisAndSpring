package com.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@service("userService")用于把当前的类注析为一个Spring的bean,名为userService

import com.mybatis.mapper.UserMapper;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	//自动注入UserMapper
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(Integer id, String name) {
		// TODO Auto-generated method stub
		return userMapper.findWithIdAndName(id, name);
	}
	
}
