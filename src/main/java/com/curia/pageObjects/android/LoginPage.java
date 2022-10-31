package com.curia.pageObjects.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.curia.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AndroidActions{

	
AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AndroidFindBy (xpath=("//android.widget.TextView[@text='Login with email']"))
	private WebElement LoginWithEmail;
	
	@AndroidFindBy(xpath=("(//android.widget.EditText)[1]"))
	private WebElement EmailTextBox;
	

	@AndroidFindBy(xpath=("(//android.view.ViewGroup)[3]"))
	private WebElement PasswordTextBox;

	@AndroidFindBy(className="android.widget.Button")
	private WebElement LoginButton;
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Email should be valid.']"))
	private WebElement ToastMassege1;
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Incorrect username or password']"))
	private WebElement ToastMassege2;
	
	
	public void ClickLoginWithEmail() 
	{
		LoginWithEmail.click();
	}
	
	
	public void SendRandomText(String randomText)
	{
		EmailTextBox.click();
		Actions action = new Actions(driver);
		action.sendKeys(randomText).perform();
		
	}
	
	
	public void SendRandomPass(String randomPass)
	{
		PasswordTextBox.click();
		Actions action = new Actions(driver);
		action.sendKeys(randomPass).perform();

		
	}
	
	public void ClickLoginButton() 
	{
		LoginButton.click();
	}
	
	public String VerifyToast1() 
	{
		String actualToastMsg = ToastMassege1.getText();
		System.out.println(actualToastMsg);
		return actualToastMsg;
	}
	
	
	public void SendInvalidEmail(String Email)
	{
		EmailTextBox.click();
		Actions action = new Actions(driver);
		action.sendKeys(Email).perform();
	}
	
	
	public void SendPassword(String Pass)
	{
		PasswordTextBox.click();
		Actions action = new Actions(driver);
		action.sendKeys(Pass).perform();
	}
	
	
	public String VerifyToast2() 
	{
		String actualToastMsg2 = ToastMassege2.getText();
		System.out.println(actualToastMsg2);
		return actualToastMsg2;
	}
	
	
	
}
