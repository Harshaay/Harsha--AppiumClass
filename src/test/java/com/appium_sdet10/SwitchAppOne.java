package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class SwitchAppOne {
@Test
public void switchapp() throws IOException, InterruptedException

{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.google.android.calculator", "com.android.calculator2.Calculator");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	String appPackageGeneralStore ="com.androidsample.generalstore";
	String appActivityGeneralStore=".SplashActivity";
	//switch to another App
	driver.startActivity(appPackageGeneralStore, appActivityGeneralStore);
	Thread.sleep(4000);
	 //Run App in background
	//driver.runAppInBackground(10);
	
	//to launch App given in desired capabilities
	driver.launchApp();
	
	
   }
}
