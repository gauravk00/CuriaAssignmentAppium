package com.curia.pageObjects.android;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage2 extends AndroidActions{
	
AndroidDriver driver;
	
	public SplashPage2(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath=("//android.widget.TextView"))
	private WebElement VerifyTitle2;
	
	@AndroidFindBy(xpath=("(//android.widget.TextView)[2]"))
	private WebElement Description2;
	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement Button2;

	public String GettingTitle2()
	{
		try {
		String actualTitle2 = VerifyTitle2.getText();
		System.out.println(actualTitle2);
		return actualTitle2;
		}catch(StaleElementReferenceException e)
		{String actualTitle2 = VerifyTitle2.getText();
		System.out.println(actualTitle2);
		return actualTitle2;
		}
	}

	public String GettingDescription2()
	{
		String actualDesc2 = Description2.getText();
		System.out.println(actualDesc2);
		return actualDesc2;
	}
	
	public void ClickOnButton2()
	{
		Button2.click();
	}
}
