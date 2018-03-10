package com.jinglun.pool;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Hikaricppool {
	
//	static{
////		driver=com.mysql.jdbc.Driver
////		url=jdbc\:mysql\://127.0.0.1\:3306/test
////		user=root
////		password=123
//		con.setPassword("123");
//		con.setJdbcUrl("jdbc\\:mysql\\://127.0.0.1\\:3306/test");
//		con.setUsername("root");
//		con.setDriverClassName("com.mysql.jdbc.Driver");
//	}
		
	public static void main(String[] args) throws SQLException {
		 HikariConfig con = new HikariConfig();
			con.setPassword("123");
			con.setJdbcUrl("jdbc:mysql:///test");
			con.setUsername("root");
			con.setDriverClassName("com.mysql.jdbc.Driver");
		 HikariDataSource hikari = new HikariDataSource(con);
		System.out.println(hikari.getConnection());
	}

}
