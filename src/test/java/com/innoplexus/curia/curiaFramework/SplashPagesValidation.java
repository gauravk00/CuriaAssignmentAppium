package com.innoplexus.curia.curiaFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.curia.pageObjects.android.SplashPage1;
import com.curia.pageObjects.android.SplashPage2;
import com.curia.pageObjects.android.SplashPage3;
import com.curia.pageObjects.android.SplashPage4;
import com.curia.pageObjects.android.SplashPage5;

public class SplashPagesValidation extends BaseTest {
	
	@Test
	public void TestSplash1() {
		
		SplashPage1 splashPage1 = new SplashPage1(driver);
		String actualTitle1 = splashPage1.GettingTitle1();
		String expectedTitle1 = "Discover treatments";
		Assert.assertEquals(actualTitle1, expectedTitle1);
		
		String Description1 = splashPage1.GettingDescription1();
		String expectedDesc1 = "Based on your medical profile, receive a curated list of approved treatments across multiple therapy types for you to discuss with your doctor.";
		Assert.assertEquals(Description1, expectedDesc1);
		
		splashPage1.ClickOnButton1();
	}
	
	
	@Test	
	public void TestSplash2() {
		
	    SplashPage2 splashPage2 = new SplashPage2(driver);
		String actualTitle2 = splashPage2.GettingTitle2();
		String expectedTitle2 = "Explore clinical trials near you";
		Assert.assertEquals(actualTitle2, expectedTitle2);
		
		String Description2 = splashPage2.GettingDescription2();
		String expectedDesc2 = "Get matched to recruiting clinical trials globally that you qualify for based on answering a few questions.";
		Assert.assertEquals(Description2, expectedDesc2);
		
		splashPage2.ClickOnButton2();
	}

	@Test	
	public void TestSplash3() {
			
		    SplashPage3 splashPage3 = new SplashPage3(driver);
			String actualTitle3 = splashPage3.GettingTitle3();
			String expectedTitle3 = "Find experts";
			Assert.assertEquals(actualTitle3, expectedTitle3);
			
			String Description3 = splashPage3.GettingDescription3();
			String expectedDesc3 = "Find expert oncologists in your area to consult for your condition or to receive a second opinion.";
			Assert.assertEquals(Description3, expectedDesc3);
			splashPage3.ClickOnButton3();
		}

	
	@Test	
	public void TestSplash4() {
			
		    SplashPage4 splashPage4 = new SplashPage4(driver);
			String actualTitle4 = splashPage4.GettingTitle4();
			String expectedTitle4 = "Meet your Cancer Twin";
			Assert.assertEquals(actualTitle4, expectedTitle4);
			
			String Description4 = splashPage4.GettingDescription4();
			String expectedDesc4 =  "Connect to a patient with the most similar diagnosis.";
			Assert.assertEquals(Description4, expectedDesc4);
			
			splashPage4.ClickOnButton4();
		}

	@Test	
	public void TestSplash5() {
			
		    SplashPage5 splashPage5 = new SplashPage5(driver);
			String actualTitle5 = splashPage5.GettingTitle5();
			String expectedTitle5 = "We respect your privacy";
			Assert.assertEquals(actualTitle5, expectedTitle5);
			
			String Description5 = splashPage5.GettingDescription5();
			String expectedDesc5 = "To help us to adhere to country specific security and privacy policies to safeguard user data and protect information, please choose your country." ;
			Assert.assertEquals(Description5, expectedDesc5);
			
			splashPage5.ChooseCountry("India");
			splashPage5.ClickOnButton5();
		}
}
