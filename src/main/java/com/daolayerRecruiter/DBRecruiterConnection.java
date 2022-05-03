package com.daolayerRecruiter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBRecruiterConnection {
	public static Connection getDBRecruiterConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placementsys","root","9514067534");
		return con;
		}
}
