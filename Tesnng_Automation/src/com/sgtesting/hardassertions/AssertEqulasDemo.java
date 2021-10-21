package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqulasDemo {
	
	@Test
	public void method1()
	{
		try
		{
			String s1=new String("JavaScript");
			String s2=new String("JavaScript");
			Assert.assertEquals(s1, s2);
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
			String s1=new String("JavaScriptNew");
			String s2=new String("JavaScript");
			Assert.assertNotEquals(s1, s2);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
