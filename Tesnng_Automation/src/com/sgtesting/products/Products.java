package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The product demoProduct1 has created successfully!!!");
	}

	@Test
	public void modifyProduct()
	{
		System.out.println("The product demoProduct1 has modifified successfully!!!");
	}
	
	@Test
	public void deletedProduct()
	{
		System.out.println("The product demoProduct1 has deleted successfully!!!");
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
