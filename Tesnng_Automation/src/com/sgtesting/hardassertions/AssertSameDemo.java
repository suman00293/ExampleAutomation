package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
// assertSame should verifies the reference
public class AssertSameDemo {
	
	@Test
	public void method1()
	{
		try
		{
			String s1="JavaScript";
			String s2=new String("JavaScript");
			Assert.assertSame(s1, s2);
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
			String s1="JavaScript";
			String s2=new String("JavaScriptNew");
			Assert.assertNotSame(s1, s2);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
