package com.appium_sdet10;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.StartServerGeneric;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class GeneralStoreCart 

{
@Test

public void cartlaunch() throws IOException, InterruptedException
{
	StartServerGeneric ssg = new StartServerGeneric();
	ssg.startserver();
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.androidsample.generalstore", ".SplashActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	//driver.findElementById("android:id/text1").click();
	driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Harsha A Y");
	
	driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	
	driver.findElementById("com.androidsample.generalstore:id/productAddCart").click();
	
	driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
	
	driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
	Thread.sleep(4000);
	Set<String> apps = driver.getContextHandles();
	for(String app:apps)
	{
		System.out.println(app);
	}
	Thread.sleep(4000);
	driver.context("WEBVIEW_com.androidsample.generalstore");
	Thread.sleep(4000);
	
	//System.out.println("1");
	MobileElement search = (MobileElement) driver.findElementByXPath("//input[@type='search']");
	wu.visibilityofelement(search, driver);
	search.sendKeys("INDIA");
	
	
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	
    ssg.stopserver();
  }
}
