package com.curia.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class AppiumUtils  {

		AndroidDriver driver;
	public String getScreenShotPath (String testCaseName, AndroidDriver driver) throws IOException
	{
	   File source = driver.getScreenshotAs(OutputType.FILE);
	   String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
	   FileUtils.copyFile(source, new File(destinationFile));
	   return destinationFile;
	   
	}
	
	
	

	}
