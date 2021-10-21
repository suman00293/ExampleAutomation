package com.sgtesting.hardassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test
	public void method1()
	{
		try
		{
			File f1=null;
			Assert.assertNull(f1);
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
			File f1=null;
			f1=new File("E:\\EXAMPLE");
			Assert.assertNotNull(f1);
			System.out.println("This step will execute only after the Assert Step");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
