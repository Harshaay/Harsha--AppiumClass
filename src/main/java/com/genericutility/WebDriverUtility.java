package com.genericutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
/**
 * 
 * @author Harsha A Y
 *
 */

public class WebDriverUtility {
	/**
	 * Used for implicit wait
	 * @param driver
	 */
	public void implicitwait(AndroidDriver driver){
		driver.manage().timeouts().implicitlyWait(PathConstants.implicitlywait, TimeUnit.SECONDS);
	}
	/**
	 * Used to wait till the visibility of wait
	 * @param element
	 * @param driver
	 */
	public void visibilityofelement(MobileElement element,AndroidDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, PathConstants.explicitlywait);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Used to wait till the element to be click able
	 * @param element
	 * @param driver
	 */
	public void elementtobeclickable(MobileElement element,AndroidDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, PathConstants.explicitlywait);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * Used to scroll to desired element
	 * @param driver
	 * @param an
	 * @param av
	 */
	public void scrolling(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	/**
	 * Used to get the toast message
	 * @param driver
	 * @return
	 */
	public String getToastMessage(AndroidDriver driver)
	{
		String ToastMsg = driver.findElementByXPath("//android.widget.Toast[1]").getText();
		return ToastMsg;
	}
	/**
	 * Used for long press on element
	 * @param driver
	 * @param element
	 */
	public void LongPressAction(AndroidDriver driver,MobileElement element)
	{
		TouchAction ta = new TouchAction(driver);
		ta.longPress(element).waitAction(PathConstants.longpresswait).release().perform();
	}
	/**
	 * Used to zoom in
	 * @param driver
	 * @param element
	 */
	public void ZOOMIN(AndroidDriver driver,MobileElement element)
	{
		driver.zoom(element);
	}
	/**
	 * Used to zoom out
	 * @param driver
	 * @param element
	 */
	public void ZOOMOUT(AndroidDriver driver,MobileElement element)
	{
		driver.pinch(element);
	}
	/**
	 * Used to drag and drop
	 * @param driver
	 * @param src
	 * @param dst
	 */
	public void DragAndDrop(AndroidDriver driver,WebElement src,WebElement dst)
	{
		TouchAction ta = new TouchAction(driver);
		ta.longPress(src).waitAction(PathConstants.longpresswait).moveTo(dst).release().perform();
	}
	/**
	 * Used to set to landscape mode
	 * @param driver
	 */
	public void setLANDSCAPEorientation(AndroidDriver driver)
	{
		driver.rotate(ScreenOrientation.LANDSCAPE);
	}
	/**
	 * Used to set to portrait mode
	 * @param driver
	 */
	public void setPORTRAITorientation(AndroidDriver driver)
	{
		driver.rotate(ScreenOrientation.PORTRAIT);
	}

}
