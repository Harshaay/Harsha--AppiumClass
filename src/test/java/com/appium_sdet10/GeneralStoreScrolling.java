package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.StartServerGeneric;
import com.genericutility.WebDriverUtility;
import com.objectrepository.GeneralStoreAppLogin;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreScrolling {
@Test
public void storescroll() throws IOException
{
	StartServerGeneric ssg = new StartServerGeneric();
	ssg.startserver();
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.androidsample.generalstore", ".SplashActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	GeneralStoreAppLogin gsa = new GeneralStoreAppLogin(driver);
	wu.visibilityofelement(gsa.getNametxtbox(), driver);
	gsa.getNametxtbox().sendKeys("Harsha");
	String color = gsa.getLetsShopBtn().getCssValue("color");
	System.out.println(color);
	gsa.getLetsShopBtn().click();
	 //driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Harsha A Y");
	
    // driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	
	wu.scrolling(driver, "text", "PG 3");
	
	ssg.stopserver();

   }
}
