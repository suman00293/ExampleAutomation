package com.sgtesting.users.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("The User demoUser1 has created successfully!!!");
	}

	@Test
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modifified successfully!!!");
	}
	
	@Test
	public void deletedUser()
	{
		System.out.println("The User demoUser1 has deleted successfully!!!");
	}
	
	@BeforeClass
	public void intialization()
	{
		System.out.println("Launch the chrome Browser and Navigate the Application URL and Login into the Application");
	}
	
	@AfterClass
	public void cleanUp()
	{
		System.out.println("Logout from the Application successfully!!!  and Close the Application ...");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
}
