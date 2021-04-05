package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class interConnection {
	@Test
	public void conn() throws IOException, InterruptedException
	{
		GenericToLaunch got = new GenericToLaunch();
		AndroidDriver driver = got.launchapp("com.google.android.calculator", "com.android.calculator2.Calculator");
		WebDriverUtility wu = new WebDriverUtility();
		wu.implicitwait(driver);
		
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.ALL);
		Thread.sleep(2000);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.DATA);
		Thread.sleep(2000);
		System.out.println(driver.getConnection());
		Thread.sleep(2000);
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);
		Thread.sleep(2000);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.ALL);
		
	}

}
