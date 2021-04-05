package com.genericutility;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Harsha A Y
 *
 */

public class GenericToLaunch {
	DesiredCapabilities cap = new DesiredCapabilities();
	FileUtility fu = new FileUtility();
	public  AndroidDriver launchapp(String appPackage,String  appActivity) throws IOException
	{
		
		cap.setCapability("deviceName",fu.ReadpropData("deviceName") );
		cap.setCapability("automationName", fu.ReadpropData("automationName"));
		cap.setCapability("platformName", fu.ReadpropData("platformName"));
		cap.setCapability("platformVersion",fu.ReadpropData("platformVersion"));
		cap.setCapability("noReset", true);
		
		cap.setCapability("UDID", fu.ReadpropData("UDID"));
		
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
		
		URL url = new URL(fu.ReadpropData("URL"));
		AndroidDriver driver = new AndroidDriver(url,cap);
		
		return driver;
	}
	
}
