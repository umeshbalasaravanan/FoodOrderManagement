package com.foms.businesstier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foms.businesstier.entity.User;
import com.foms.businesstier.helper.FomsDataConnection;
import com.foms.businesstier.helper.FomsDbQuery;


public class UserDao {
	private static Logger log = Logger.getLogger(UserDao.class);
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private FomsDbQuery query;
	
	public UserDao() {
		ApplicationContext context =  new ClassPathXmlApplicationContext("/applicationConfig.xml");
		query = (FomsDbQuery)context.getBean("sqlbean");
		
	}
	
	public User searchUser2(String username, String password) throws ClassNotFoundException, SQLException {
	
		connection = FomsDataConnection.createConnection();
		System.out.println(query.getSearchQuery());
		ps = connection.prepareStatement(query.getSearchQuery());
		ps.setString(1, username);
		ps.setString(2, password);
		rs = ps.executeQuery();
		User user = new User();
		System.out.println("before while block");
		while(rs.next()) {
			user.setEmailId(rs.getString(1));
			//System.out.println(user.getEmailId());
			user.setPassword(rs.getString(2));
			user.setFname(rs.getString(3));
			user.setLname(rs.getString(4));
			user.setPhoneNumber(rs.getString(5));
			user.setAddress(rs.getString(6));
		}
		return user;
		
	}
}
