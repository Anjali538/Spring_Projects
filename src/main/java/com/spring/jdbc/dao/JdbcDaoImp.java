package com.spring.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.spring.orm.hibernate.ORMMain;

public class JdbcDaoImp {
	public int getCircle(int id) {
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");
			// here Employee is database name, root is username and password,
			// Employee_Details2 is table
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(ORMMain.db_query_sql_employee);
			while (rs.next())
				result = rs.getInt(1);

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;
	}

}
