package com.appium_sdet10;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class InstallApp {
@Test
public void installapp01() throws MalformedURLException
{
DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName", "Nokia 7.1");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10");
	cap.setCapability("UDID", "CTLID18111603552");
	cap.setCapability("app","E:\\SDET 10\\APK\\General-Store.apk");
	//cap.setCapability("appPackage", "com.adobe.reader");
	//cap.setCapability("appActivity",".AdobeReader");
	
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url,cap);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
    }
}
