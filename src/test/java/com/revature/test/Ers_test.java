package com.revature.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.enums.UserRole;
import com.revature.models.User;
import com.revature.repositories.UserDAO;
import com.revature.repositories.UserPostgresDAO;

class Ers_test {

	UserDAO u = new UserPostgresDAO();
	@Test
	void UserNotFoundTest() throws SQLException {
		
		Assertions.assertThrows(SQLException.class, () -> {
		    u.getUser("yoyo", "honeysingh");
		  });
		 
	}
	
	@Test
	void UserFound() throws SQLException {
		Assert.assertNotNull(u.getUser("mantesh","password"));
	}
	
	
	@Test
	void TestUserName() throws SQLException {
		User user=u.getUser("mantesh", "password");
		assertEquals("Mantesh",user.getFirstName());
	}
	
	@Test
	void TestUserRoleEmployee() throws SQLException{
		User user=u.getUser("mantesh", "password");
		assertEquals(UserRole.EMPLOYEE,user.getRole());
	}
	
	@Test
	void TestUserRoleAdmin() throws SQLException {
		User user=u.getUser("admin", "password");
		assertEquals(UserRole.FINANCE_MANAGER,user.getRole());

	}
	
	@Test
	void UserNotAdmin() throws SQLException{
		User user=u.getUser("mantesh", "password");
		
		assertFalse("User is Admin",UserRole.FINANCE_MANAGER==user.getRole());
	}
}
