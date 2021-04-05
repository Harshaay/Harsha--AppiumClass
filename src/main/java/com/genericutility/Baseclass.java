package com.genericutility;
/**
 * 
 * @author Harsha A Y
 *
 */

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class Baseclass {
public	DesiredCapabilities cap = new DesiredCapabilities();
public	AndroidDriver driver;
public FileUtility fu = new FileUtility();


public void launchapp() throws IOException
{
	
	GenericToLaunch got = new GenericToLaunch();
	got.launchapp("com.google.android.calculator","com.android.calculator2.Calculator");
	
	
   }
}
