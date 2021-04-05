package com.appium_sdet10;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class ChromeDriver {
@Test
public void chromelaunch() throws MalformedURLException

{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Nokia 7.1");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion","10");
	cap.setCapability("UDID", "CTLID18111603552");
	cap.setCapability("browserName", "Chrome");

	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	WebDriverUtility wu = new WebDriverUtility();
	driver.get("https://www.facebook.com");
	wu.implicitwait(driver);
	driver.findElementByXPath("//input[@type='email']").sendKeys("Harsha@y.com");
	driver.findElementByXPath("//input[@type='password']").sendKeys("123456");
	driver.findElementByXPath("//button[@type='button']").click();
	
	
	
	
   }
}
