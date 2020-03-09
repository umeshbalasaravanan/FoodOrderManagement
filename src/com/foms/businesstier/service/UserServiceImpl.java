package com.foms.businesstier.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import com.foms.businesstier.dao.UserDao;
import com.foms.businesstier.entity.User;

public class UserServiceImpl {
	private static Logger log = Logger.getLogger(UserServiceImpl.class);
	
	public User searchUser1(String username, String password) throws SQLException, ClassNotFoundException {
		
		User user = new User();
		UserDao userdao = new UserDao();
		System.out.println("Calling searchUser2 of UserDao class");
		user = userdao.searchUser2(username,password);
		return user;
	}
}
