package com.appium_sdet10;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class LaunchTouchScreen {

	@Test
	public void launchtouchscreen() throws MalformedURLException
	{
DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName", "Nokia 7.1");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10");
	cap.setCapability("UDID", "CTLID18111603552");
	cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	cap.setCapability("appActivity",".TouchScreenTestActivity");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	WebDriverUtility wu = new WebDriverUtility();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
}