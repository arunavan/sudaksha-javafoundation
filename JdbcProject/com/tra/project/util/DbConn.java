package com.tra.project.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {

	public static  Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","training","training");
		return con;
	}
}
