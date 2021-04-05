package com.appium_sdet10;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class ScaleView {
@Test
public void scaleView() throws IOException, Throwable
{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.davemorrissey.labs.subscaleview.sample", ".MainActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
	
//	WebElement image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
	//driver.zoom(image);
	//Thread.sleep(3000);
	//driver.pinch(image);
   
	int x = driver.manage().window().getSize().getWidth()/2;
	int y = driver.manage().window().getSize().getHeight()/2;
	TouchAction finger1 = new TouchAction(driver);
	finger1.press(x, y-100).moveTo(x, y-800);
	
	TouchAction finger2=new TouchAction(driver);
	finger2.press(x, y+100).moveTo(x, y+800);
	
	MultiTouchAction mta = new MultiTouchAction(driver);
	mta.add(finger1).add(finger2).perform();
	
	TouchAction finger3 = new TouchAction(driver);
	finger3.press(x, y-800).moveTo(x, y-100);
	
	TouchAction finger4 = new TouchAction(driver);
	finger4.press(x, y+800).moveTo(x, y+100);
	
	
	MultiTouchAction mta2 = new MultiTouchAction(driver);
	mta2.add(finger3).add(finger4).perform();
	//volume up
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	Thread.sleep(3000);
	//volume down
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	//volume mute
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_MUTE);
	//brightness up
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	Thread.sleep(2000);
	//brightness down
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	//back
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	
	//enter
	
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
   }
}
