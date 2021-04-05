package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericutility.WebDriverUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * @author Harsha A Y
 *
 */

public class GeneralStoreAppLogin {
	AndroidDriver driver;
	/**
	 * 
	 * @param driver
	 */
	public GeneralStoreAppLogin(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter name here']")
	private MobileElement Nametxtbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement LetsShopBtn;
	
	@AndroidFindBy(id="android:id/text1")
	private MobileElement Dropdown;
	
	@AndroidFindBy(className="android.widget.TextView")
	private MobileElement options;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement male;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement female;
	
	
	public MobileElement getOptions() {
		return options;
	}
	
   public void selectoption(String av)
   {
	   WebDriverUtility wu = new WebDriverUtility();
	   wu.scrolling(driver, "text", av);
	   WebElement op = driver.findElementByXPath("//android.widget.TextView[@text='"+av+"']");
	   op.click();
   }
	public MobileElement getNametxtbox() 
   {
		return Nametxtbox;
   }
	

	public MobileElement getLetsShopBtn() 
	{
		return LetsShopBtn;
	}

	public MobileElement getMale()
	{
		return male;
	}

	public MobileElement getFemale() 
	{
		return female;
	}
	
}
