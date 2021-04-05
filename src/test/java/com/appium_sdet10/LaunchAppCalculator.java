package com.appium_sdet10;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.genericutility.Baseclass;
import com.genericutility.FileUtility;
import com.genericutility.GenericToLaunch;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchAppCalculator 
{
@Test
public void applaunch() throws MalformedURLException, Throwable
{
	//DesiredCapabilities cap = new DesiredCapabilities();
	//cap.setCapability("appPackage", "com.google.android.calculator");
	//cap.setCapability("appActivity","com.android.calculator2.Calculator");
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.google.android.calculator", "com.android.calculator2.Calculator");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	 
	MobileElement seven =(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
	
	driver.tap(1, seven, 500);
	
	driver.findElementByAccessibilityId("multiply").click();
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	
	//driver.findElementByAccessibilityId("equals").click();
	
    }
}