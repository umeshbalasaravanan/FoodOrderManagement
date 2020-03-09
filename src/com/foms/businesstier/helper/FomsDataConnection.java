package com.foms.businesstier.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;




public class FomsDataConnection {
	private static Logger log = Logger.getLogger(FomsDataConnection.class);
	
	private static Connection connection = null;
	
	public static Connection createConnection() throws ClassNotFoundException,
	SQLException {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/foodorderdatabase?characterEncoding=latin1", "root", "root");
log.info("----Connection established with MYSQL database----");
System.out.println("----Connection established with MYSQL database----");
return connection;
}
	
public static void closeConnection() throws SQLException {
		log.info("----Connection closed with MYSQL database----");
		System.out.println("----Connection closed with MYSQL database----");
		connection.close();
	}
}
