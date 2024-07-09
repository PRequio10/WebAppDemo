package test;

import org.junit.jupiter.api.Test;

import com.web.dbconnection.DBConnection;

import java.sql.*;

class DBConnectionTest {

	@Test
	void Connectiontest() throws SQLException {
		DBConnection dbConn = DBConnection.getInstance();
		Connection conn = dbConn.getConnection();
		
		if (conn != null) {
			System.out.println("Connected to database");
		} else {
			System.out.println("Unable to connect to database");
		}
	}

}
