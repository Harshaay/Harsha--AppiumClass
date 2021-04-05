package com.objectrepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorApp 
{
	AndroidDriver driver;
@AndroidFindBy(id="com.google.android.calculator:id/digit_7")
private MobileElement seven;

public  CalculatorApp(AndroidDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

@AndroidFindBy(accessibility="multiply")
private MobileElement multiply;

@AndroidFindBy(id="com.google.android.calculator:id/digit_2")
private MobileElement two;

public MobileElement getmultiply()
{
	return multiply;
}
public MobileElement getSeven()
{
	return seven;
}
 public MobileElement gettwo()
 {
 return two;
}
}
