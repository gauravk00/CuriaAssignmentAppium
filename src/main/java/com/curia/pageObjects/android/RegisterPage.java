package com.curia.pageObjects.android;

import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPage extends AndroidActions{

	
AndroidDriver driver;
	
	public RegisterPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
}
