package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Tasks extends Initialization{
	
	/**
	 * TestCase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("T1");
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * TestCase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void modifyTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")).click();
			//oBrowser.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * TestCase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteTasks()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
