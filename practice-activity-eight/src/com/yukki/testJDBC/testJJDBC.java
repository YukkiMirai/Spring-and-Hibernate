package com.yukki.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee_manager";
		String user = "root";
		String pass = "1234";
			try {
				Connection myConn = DriverManager.getConnection(url, user, pass);
				System.out.println("Success");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
