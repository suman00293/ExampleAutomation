package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
	
	@Test
	public void method1()
	{
		try
		{
			int a=25;
			Assert.assertTrue(a>=10);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void method2()
	{
		try
		{
			int a=25;
			Assert.assertFalse(a<=10);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
