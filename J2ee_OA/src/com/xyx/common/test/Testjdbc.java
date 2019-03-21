package com.xyx.common.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/platform";
		String user = "xyx";
		String password = "xyx9";
		//建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}

}
