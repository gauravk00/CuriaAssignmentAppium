package com.curia.utils;

import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions extends AppiumUtils {
	
	AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver)
	{
	
		this.driver =driver;
	}

	public void scrollToText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));

	}
	
	public void sendKeys(String text)
	{
		Actions action = new Actions(driver);
		action.sendKeys(text).perform();
	}
	
}
