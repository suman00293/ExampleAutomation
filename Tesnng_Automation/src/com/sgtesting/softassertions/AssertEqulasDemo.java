package com.sgtesting.softassertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqulasDemo {

	@Test
	public void method1()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			String s1=new String("JavaScript");
			String s2=new String("JavaScript");
			soft.assertEquals(s1, s2);
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
			String s1=new String("JavaScriptNew");
			String s2=new String("JavaScript");
			soft.assertNotEquals(s1, s2);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
