package com.web.dao;

import java.sql.*;
import com.web.model.User;

public interface userRegProcess {
	
	public Connection Conn() throws SQLException;
	public void InsertUser(User user) throws SQLException;
	public void RetrieveUser(User user)  throws SQLException;

}
