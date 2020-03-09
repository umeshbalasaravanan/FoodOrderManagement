package com.foms.businesstier.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foms.businesstier.entity.User;
import com.foms.businesstier.service.UserServiceImpl;



@Controller
public class UserController {
	private static Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping("/searchUser.htm")
	public ModelAndView searchUser(HttpServletRequest request,HttpServletResponse response) throws SQLException, ClassNotFoundException {
		
		try {
			if(request == null || response == null) {
				log.info("Request or response failed for search user");
				System.out.println("request or response failed fr search user");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username "+ username);
		ModelAndView mv = new ModelAndView();
		HttpSession hs = request.getSession();
		if(hs.isNew()) {
			hs.setAttribute("username", username);
			hs.setAttribute("password", password);
		} else {
			hs.getAttribute("username").toString();
			hs.getAttribute("password").toString();
		}
		User user = new User();
		UserServiceImpl userviceimpl = new UserServiceImpl();
		System.out.println("calling searchUser1 method in UserServiceImpl class");
		user = userviceimpl.searchUser1(username, password);
		System.out.println("user name " + username);
		System.out.println("email id " + user.getEmailId());
		boolean condition = username.equals(user.getEmailId());
		System.out.println("condition value : " + condition);
		System.out.println(" " + user.getEmailId());
		if(username.equals(user.getEmailId())) {
			System.out.println("inside if clause");
			mv.addObject(user);
			mv.setViewName("/hotelList.jsp");
			return mv;
		}
		else {
			System.out.println("inside else clause");
			mv.addObject("ERROR", "Invalid Username / Password.");
			mv.setViewName("/login.jsp");
			return mv;
			
		
	}
	}
	@RequestMapping("/insertUser.htm")
	public ModelAndView insertUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
