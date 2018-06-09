package com.mybatis.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mybatis.model.User;
import com.mybatis.service.UserService;

@Controller
public class UserController {

	//自动注入UserService
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(String id,String name,ModelAndView mv,HttpSession session) {
	User user=userService.login(Integer.parseInt(id.trim()), name);
	if(user!=null) {
	session.setAttribute("user", user);
	//转发到main请求
	mv.setView(new RedirectView("/mybatisAndSpring/main"));
	}else {
		mv.addObject("message", "登录失败");
		
	}	
	return mv;
	}
}
