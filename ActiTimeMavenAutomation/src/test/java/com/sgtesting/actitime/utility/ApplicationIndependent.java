package com.sgtesting.actitime.utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApplicationIndependent {
	public static void main(String a[])
	{
		String datevalue=getDateTime("dd-MMM-yy");
		System.out.println(datevalue);
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void waitFor(long seconds)
	{
		try
		{
			long miliseconds=(seconds*1000);
			Thread.sleep(miliseconds);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static Properties property(String FileName)
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream(FileName);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static String getDateTime(String strDateFormat)
	{
		String strDateTime=null;
		try
		{
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
			strDateTime=sdf.format(cal.getTime());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return strDateTime;
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void captureScreenShot(WebDriver oBrowser,String destFileName)
	{
		try {
			File screenshotFile = ((TakesScreenshot) oBrowser).getScreenshotAs(OutputType.FILE);
			File destFile=new File(destFileName);
			FileUtils.copyFile(screenshotFile, destFile);
			
        } catch (Exception ex) {
            System.err.println(ex);
        }
	}
}
