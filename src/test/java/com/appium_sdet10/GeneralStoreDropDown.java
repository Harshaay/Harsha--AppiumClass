package com.appium_sdet10;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;
import com.objectrepository.GeneralStoreAppLogin;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreDropDown {
@Test
public void DropDown() throws IOException
{
	GenericToLaunch got = new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.androidsample.generalstore", ".SplashActivity");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementById("android:id/text1").click();
	GeneralStoreAppLogin gsl = new GeneralStoreAppLogin(driver);
	
	List<MobileElement> lis = driver.findElementsByClassName("android.widget.TextView");
	
	for(MobileElement op:lis)
	{
		String Country = op.getText();
		System.out.println(Country);
	}
	
	
	//wu.scrolling(driver, "text", "India");
	 gsl.selectoption("Fiji");
	 
	 gsl.getNametxtbox().sendKeys("Harsha");
	 
	//driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
	 gsl.getLetsShopBtn().click();

    }
}
