package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class NotificationReminder {
@Test
public void notifyreminder() throws IOException
{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.bhanu.notificationreminders", ".MainDrawerActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("Appium");
	driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteText").sendKeys("Notify");
	driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
	
	driver.openNotifications();////android.widget.ImageView[@resource-id='android:id/right_icon']
	driver.findElementByXPath("(//android.widget.ImageView[@resource-id='android:id/right_icon'])[1]").click();
   }
}
