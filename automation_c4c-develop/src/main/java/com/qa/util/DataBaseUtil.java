package com.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {

	public static ResultSet retrieveData(String ConnStr, String UserName, String Password, String QueryStmt)
			throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");

		try (Connection con = DriverManager.getConnection(ConnStr, UserName, Password)) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(QueryStmt);
			System.out.println(rs);

			return rs;
		}
	}
}
