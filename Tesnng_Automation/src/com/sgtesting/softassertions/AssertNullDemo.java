package com.sgtesting.softassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	
	@Test
	public void method1()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			File f1=null;
			soft.assertNull(f1);
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
			File f1=null;
			f1=new File("E:\\EXAMPLE");
			soft.assertNotNull(f1);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
