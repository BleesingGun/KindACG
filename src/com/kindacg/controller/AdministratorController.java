package com.kindacg.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kindacg.entity.Administrator;
import com.kindacg.service.impl.AdministratorServiceDaoImpl;

@Controller
public class AdministratorController {
	
	@Autowired
	AdministratorServiceDaoImpl administratorServiceDaoImpl;
	
	@RequestMapping("/administrator_login")
	public String Login(Administrator a, HttpSession session) throws Exception{
		Administrator administrator = administratorServiceDaoImpl.Login(a);
		if(administrator != null){
			session.setAttribute("Administrator", administrator);
			return "redirect:/UserList.jsp";
			
		}
		return "redirect:/Error.jsp";
	}
	
	/*@RequestMapping("/administrator_select")
	public String Select(HttpSession session) throws Exception{
		
		session.setAttribute("users", administratorServiceDaoImpl.Select());
		return "UserList.jsp";
	}*/
}