package com.appium_sdet10;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.StartServerGeneric;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class HandleToastMessage {
@Test
public void toastmessage() throws IOException, InterruptedException
{
	StartServerGeneric ssg =new StartServerGeneric();
	ssg.startserver();
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.androidsample.generalstore", ".SplashActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Harsha A Y");
	
	//driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	
	//driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
	Thread.sleep(4000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	
	//Read Toast Message from screen
	 //String text = driver.findElementByXPath("//android.widget.Toast[1]").getText();
	 String text = wu.getToastMessage(driver);
	 System.out.println("$$$$$$$$$$$$$$$$$$$$$");
	 System.out.println(text);
	 System.out.println("$$$$$$$$$$$$$$$$$$$$$");
	
		 ssg.stopserver();
	 
}
}
