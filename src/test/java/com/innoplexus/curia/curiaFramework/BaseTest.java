package com.innoplexus.curia.curiaFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	
	@BeforeClass(alwaysRun=true)
public void AppiumConfig() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//curia//resources//data.properties");
		prop.load(fis);
		
		
		UiAutomator2Options options = new UiAutomator2Options();
	
		options.setDeviceName(prop.getProperty("AndroidDeviceName"));
		options.setPlatformName("UiAuomator2");
		options.setAppPackage("com.innoplexus.patientapp");
		options.setAppActivity("com.innoplexus.patientapp.MainActivity");
		options.setAppWaitActivity("com.innoplexus.patientapp.MainActivity");
		options.setAppWaitDuration(Duration.ofMillis(3000));
		//options.setCapability("noReset", true);
		//options.setCapability("fullReset", false);
		options.setCapability("unicodeKeyboard", false);
		options.setCapability("resetKeyboard", false);
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

}
	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
	}
	
	
}