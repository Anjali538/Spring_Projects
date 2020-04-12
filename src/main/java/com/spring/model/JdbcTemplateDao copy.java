package com.spring.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.hibernate.ORMMain;

@Repository(value = "daoClass")
public class JdbcTemplateDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;

	public int getEmpCountUsingBoilerPlate() {
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Connection conn = dataSource.getConnection(); we can use this line istead of below when we configure bean in spring xml
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

	public int getEmpCountUsingJdbcTemplate() {
		// jdbcTemplate.setDataSource(dataSource);
		Long count = (Long) jdbcTemplate.queryForMap(ORMMain.db_query_sql_employee).get("count(*)");
		
	
		return count.intValue();
	}

}
