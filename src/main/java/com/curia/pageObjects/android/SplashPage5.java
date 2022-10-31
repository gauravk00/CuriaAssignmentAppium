package com.curia.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage5 extends AndroidActions{
	
	AndroidDriver driver;
	
	public SplashPage5(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className="android.widget.TextView")
	private WebElement VerifyTitle5;
	
	@AndroidFindBy(xpath=("(//android.widget.TextView)[2]"))
	private WebElement Description5;
	
	@AndroidFindBy(xpath="(//android.view.ViewGroup)[2]")
	private WebElement countryButton;

	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement Button5;
	
	
	
	public String GettingTitle5()
	{
		try {
		String actualTitle5 = VerifyTitle5.getText();
		System.out.println(actualTitle5);
		return actualTitle5;
		}catch(StaleElementReferenceException e)
		{String actualTitle5 = VerifyTitle5.getText();
		System.out.println(actualTitle5);
		return actualTitle5;
		}
	}

	public String GettingDescription5()
	{
		String actualDesc5 = Description5.getText();
		System.out.println(actualDesc5);
		return actualDesc5;
	}
	
	public void ChooseCountry(String countryName)
	{
		countryButton.click();
		scrollToText(countryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
		
	}
	
	public void ClickOnButton5()
	{
		Button5.click();
	}
	
	
}


