package com.kindacg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindacg.entity.User;
import com.kindacg.service.impl.UserServiceDaoImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceDaoImpl userServiceDaoImpl;
	@RequestMapping("/user_login")
	public String Login(User u,HttpSession session) throws Exception{
		User user = userServiceDaoImpl.Login(u);
		if (user!=null){
			session.setAttribute("user", user);
			return "redirect:/Information.jsp";
		}
		return "redirect:/Error.jsp";
	}
	
}
