package com.jinglun.pool;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class Durid_Demo {
	
//		driver=com.mysql.jdbc.Driver
//				url=jdbc\:mysql\://127.0.0.1\:3306/webdvd
//				user=root
//				password=123
		
		
	public static void main(String[] args) throws SQLException {
		DruidDataSource d = new DruidDataSource();
		d.setUsername("root");
		d.setUrl("jdbc:mysql://127.0.0.1:3306/webdvd");
		d.setPassword("123");
		d.setDriverClassName("com.mysql.jdbc.Driver");
		System.out.println(d.getConnection());
	}
}
