package com.appium_sdet10;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApiDemos {
	@Test
	public void launchapidemos() throws IOException
	{
		//	DesiredCapabilities cap = new DesiredCapabilities();

		/*cap.setCapability("deviceName", "Nokia 7.1");
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10");
	cap.setCapability("UDID", "CTLID18111603552");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity",".ApiDemos");*/
		GenericToLaunch got = new GenericToLaunch();
		//got.launchapp("io.appium.android.apis", ".ApiDemos");
		AndroidDriver driver =got.launchapp("io.appium.android.apis", ".ApiDemos");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
