package com.curia.pageObjects.android;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage3 extends AndroidActions{

AndroidDriver driver;
	
	public SplashPage3(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath=("//android.widget.TextView"))
	private WebElement VerifyTitle3;
	
	@AndroidFindBy(xpath=("(//android.widget.TextView)[2]"))
	private WebElement Description3;
	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement Button3;

	public String GettingTitle3()
	{
		try {
		String actualTitle3 = VerifyTitle3.getText();
		System.out.println(actualTitle3);
		return actualTitle3;
		}catch(StaleElementReferenceException e) {
			String actualTitle3 = VerifyTitle3.getText();
			System.out.println(actualTitle3);
			return actualTitle3;
		}
	}

	public String GettingDescription3()
	{
		String actualDesc3 = Description3.getText();
		System.out.println(actualDesc3);
		return actualDesc3;
	}
	
	public void ClickOnButton3()
	{
		Button3.click();
	}
}


