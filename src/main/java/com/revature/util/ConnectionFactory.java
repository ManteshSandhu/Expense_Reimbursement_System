package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionFactory {
	
	private static ConnectionFactory cf = new ConnectionFactory(1);
	
	public static ConnectionFactory getConnectionFactory() {
		return cf;
	}
	
	private Connection[] conns;
	
	private ConnectionFactory(int numberOfConnections) {
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	String url = "jdbc:postgresql://db1.clt8ontdhm4x.us-east-2.rds.amazonaws.com:5432/pro1";
		
		String user = "user2";
		String password = "Passw0rd";
		
		try {
			this.conns = new Connection[numberOfConnections];
			for(int i =0; i< this.conns.length; i++) {
				Connection c = DriverManager.getConnection(url, user, password);
				this.conns[i]  = c;
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conns[0];
	}
	
	public void closeConnection() {}
	
	public final static Logger bankLogger = Logger.getLogger(ConnectionFactory.class);
	
	
}
