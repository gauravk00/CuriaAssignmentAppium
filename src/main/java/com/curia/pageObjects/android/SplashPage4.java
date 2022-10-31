package com.curia.pageObjects.android;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashPage4 extends AndroidActions{

	

		AndroidDriver driver;
			
			public SplashPage4(AndroidDriver driver)
			{
				super(driver);
				this.driver = driver;
				PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			}
			
			@AndroidFindBy(xpath=("//android.widget.TextView"))
			private WebElement VerifyTitle4;
			
			@AndroidFindBy(xpath=("(//android.widget.TextView)[2]"))
			private WebElement Description4;
			
			@AndroidFindBy(className="android.widget.Button")
			private WebElement Button4;

			public String GettingTitle4()
			{
				try {
				String actualTitle4 = VerifyTitle4.getText();
				System.out.println(actualTitle4);
				return actualTitle4;
				}catch(StaleElementReferenceException e)
				{String actualTitle4 = VerifyTitle4.getText();
				System.out.println(actualTitle4);
				return actualTitle4;
				}
			}

			public String GettingDescription4()
			{
				String actualDesc4 = Description4.getText();
				System.out.println(actualDesc4);
				return actualDesc4;
			}
			
			public void ClickOnButton4()
			{
				Button4.click();
			}
	}

