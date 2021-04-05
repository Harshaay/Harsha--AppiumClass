package com.appium_sdet10;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericutility.FileUtility;
import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosDropDown {
@Test
public void Dropdown() throws IOException
{
	GenericToLaunch got = new GenericToLaunch();
	FileUtility fu = new FileUtility();
	AndroidDriver driver =got.launchapp(fu.ReadpropData("PackageApiDemos"), fu.ReadpropData("ActivityApiDemos"));
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementByAccessibilityId("Views").click();
	
	driver.findElementByAccessibilityId("Controls").click();
	
	driver.findElementByAccessibilityId("2. Dark Theme").click();
	
	driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Harsha A Y");
	
	driver.findElementByAccessibilityId("Checkbox 1").click();
	
	driver.findElementByAccessibilityId("RadioButton 1").click();
	
	driver.hideKeyboard();
	
	driver.findElementById("android:id/text1").click();
	
	 List<MobileElement> lis = driver.findElementsByClassName("android.widget.CheckedTextView");
	 
	 System.out.println(lis.size());
	 
	 String exp="Earth";
	for(MobileElement op:lis)
	 {
		String Text = op.getText();
		System.out.println(Text);
		if(Text.equals(exp))
		{
			op.click();
		    break;
		}
		 
	 }
	
   }
}
