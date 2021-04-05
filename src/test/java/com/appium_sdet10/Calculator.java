package com.appium_sdet10;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.StartServerGeneric;
import com.genericutility.WebDriverUtility;
import com.objectrepository.CalculatorApp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Calculator {
	@Test
	public void applaunch() throws MalformedURLException, Throwable
	{
	 AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	 service.start();
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.google.android.calculator", "com.android.calculator2.Calculator");
	
	TouchAction ta = new TouchAction(driver);
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	 
	//MobileElement seven =(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
	   CalculatorApp cal = new CalculatorApp(driver);
	  MobileElement seven = cal.getSeven();
	  wu.LongPressAction(driver, seven);
	//ta.longPress(seven).waitAction(2000).release().perform();
	  MobileElement multiply = cal.getmultiply();
	//WebElement multiply = driver.findElementByAccessibilityId("multiply");
	driver.tap(1, multiply, 200);
	
	MobileElement two = cal.gettwo();
	two.click();
	//driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	//service.stop();
  
	}
}	