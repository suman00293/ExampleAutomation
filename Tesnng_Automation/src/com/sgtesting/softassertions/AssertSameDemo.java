package com.sgtesting.softassertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// assertSame should verifies the reference
public class AssertSameDemo {
	
	@Test
	public void method1()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			String s1="JavaScript";
			String s2=new String("JavaScript");
			soft.assertSame(s1, s2);
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
			String s1="JavaScript";
			String s2=new String("JavaScriptNew");
			soft.assertNotSame(s1, s2);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
