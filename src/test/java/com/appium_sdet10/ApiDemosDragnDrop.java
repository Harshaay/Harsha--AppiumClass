package com.appium_sdet10;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.FileUtility;
import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosDragnDrop {
@Test
public void draganddrop() throws IOException
{
	GenericToLaunch got = new GenericToLaunch();
	FileUtility fu = new FileUtility();
	AndroidDriver driver =got.launchapp(fu.ReadpropData("PackageApiDemos"), fu.ReadpropData("ActivityApiDemos"));
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementByAccessibilityId("Views").click();
	
	driver.findElementByAccessibilityId("Drag and Drop").click();
	
  WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
  WebElement dst = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
  wu.DragAndDrop(driver, src, dst);
 // TouchAction ta = new TouchAction(driver);
   //ta.longPress(src).waitAction(3000).moveTo(dst).release().perform();
   
	
}
}
