package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemosscrolling {
	@Test
	public void scrolling() throws IOException
	{
GenericToLaunch got = new GenericToLaunch();
AndroidDriver driver =got.launchapp("io.appium.android.apis", ".ApiDemos");
WebDriverUtility wu = new WebDriverUtility();
wu.implicitwait(driver);
driver.findElementByAccessibilityId("Views").click();

 wu.scrolling(driver, "text", "Layouts");
    }
}