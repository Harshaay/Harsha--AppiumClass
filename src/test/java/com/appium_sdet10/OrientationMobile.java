package com.appium_sdet10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.JavaUtils;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class OrientationMobile {
@Test
public void orientation() throws IOException, InterruptedException
{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.google.android.calculator", "com.android.calculator2.Calculator");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	
System.out.println(driver.getOrientation());
JavaUtils ju = new JavaUtils();
int num = ju.rannum();
driver.rotate(ScreenOrientation.LANDSCAPE);
System.out.println(driver.getOrientation());
Thread.sleep(3000);
driver.rotate(ScreenOrientation.PORTRAIT);
System.out.println(driver.getOrientation());
TakesScreenshot ts =(TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dst = new File("./Screenshot/scrshot"+num+".PNG");
FileUtils.copyFile(src, dst);

 }
}
