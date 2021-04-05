package com.appium_sdet10;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenSwipe {
	@Test
public void touchscreenswipe() throws IOException
{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("jp.rallwell.siriuth.touchscreentest", ".TouchScreenTestActivity");

	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);

	
	 Dimension d = driver.manage().window().getSize();
	 int ht = d.getHeight();
	System.out.println(ht);
	int wd = d.getWidth();
	System.out.println(wd);
	
	int startx=(int)(wd*.25);

	int endx=(int)(wd*.7);
	
	int starty=(int)(ht*.2);
	int endy=(int)(ht*.6);
	
	driver.swipe(startx, starty, endx, endy, 1000);
	//driver.swipe(150, 1250, 800, 500, 1000);
	//driver.swipe(800, 1000, 100, 300, 1000);
   }
}
