package com.kindacg.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindacg.entity.Power;
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
	
	@RequestMapping("/user_save")
	public String Save_user(User u,HttpSession session) throws Exception{
		Power power = new Power();
		Set<Power> powers = new HashSet<Power>();
		power.setP_comment(1);
		power.setP_retrieve(1);
		powers.add(power);
		u.setPowers(powers);
		if(userServiceDaoImpl.Save_user(u)==1){
			return "redirect:/Home.jsp";
		}
		return "redirect:Error.jsp";
	}
	
	@RequestMapping("/user_select")
	public String Select(Map<String, List<User>> models) throws Exception{
		
		models.put("users", userServiceDaoImpl.Select());
		return "/UserList";
	}
}
