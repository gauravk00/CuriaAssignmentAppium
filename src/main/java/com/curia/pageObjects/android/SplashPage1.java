package com.curia.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.curia.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage1 extends AndroidActions {
	
	AndroidDriver driver;
	
	public SplashPage1(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy (xpath="(//android.widget.TextView)[1]")
	private WebElement verifyTitle1;
	
	@AndroidFindBy (xpath="(//android.widget.TextView)[2]")
	private WebElement Description1;
	
	@AndroidFindBy(className=("android.widget.Button"))
	private WebElement Button1;
	
	
	
	
	
	public String GettingTitle1()
	{
		String actualTitle1 = verifyTitle1.getText();
		System.out.println(actualTitle1);
		return actualTitle1;
	}
	
	public String GettingDescription1()
	{
		String actualDesc1 = Description1.getText();
		System.out.println(actualDesc1);
		return actualDesc1;
	}
	
	public void ClickOnButton1()
	{
		Button1.click();
	}


	}
