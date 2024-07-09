package com.web.dao;

import com.web.dbconnection.DBConnection;
import com.web.model.User;

import java.sql.*;

public class userRegistration implements userRegProcess {
	

	@Override
	public Connection Conn() throws SQLException {
		DBConnection instance = DBConnection.getInstance();
		return instance.getConnection();
	}

	@Override
	public void InsertUser(User user) throws SQLException {
		String query = "INSERT INTO User (userName,passWord,userType) VALUES(?,?,?)";
		try (PreparedStatement stmt = Conn().prepareStatement(query)){
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassWord());
			stmt.setString(3, user.getUserType());
			stmt.executeUpdate();
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void RetrieveUser(User user) throws SQLException {
	}

}
