package com.innoplexus.curia.curiaFramework;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.curia.pageObjects.android.LoginPage;

import io.appium.java_client.android.Activity;

public class LoginTest extends BaseTest {
	
	
	
	
@Test(dataProvider="getData",groups= {"loginTc"})
public void LoginTestRandomText(String randomText, String randomPass) throws InterruptedException  {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.ClickLoginWithEmail();
		loginPage.SendRandomText(randomText);
		loginPage.SendRandomPass(randomPass);
		loginPage.ClickLoginButton();
		String actualToastMsg=loginPage.VerifyToast1();
		String expectedToastMsg = "Email should be valid.";
		Assert.assertEquals(actualToastMsg, expectedToastMsg);
		
	}
	
@Test
public void LoginTestEmail() {
	LoginPage loginPage = new LoginPage(driver);
	loginPage.ClickLoginWithEmail();
	loginPage.SendInvalidEmail("Abcd@gmail.com");
	loginPage.SendPassword("Abcd1234");
	loginPage.ClickLoginButton();
	String actualToastMsg2 =loginPage.VerifyToast2();
	String expectedToastMsg2 = "Incorrect username or password";
	Assert.assertEquals(actualToastMsg2, expectedToastMsg2);
	
}

@DataProvider
public Object [][] getData()
{
	return new Object [][] {{"Abcd","1234Abc"}};
}

}
