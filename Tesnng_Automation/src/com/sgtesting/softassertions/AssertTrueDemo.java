package com.sgtesting.softassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueDemo {
	
	@Test
	public void method1()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			int a=25;
			soft.assertTrue(a>=10);
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
			SoftAssert soft=new SoftAssert();
			int a=25;
			soft.assertFalse(a<=10);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
