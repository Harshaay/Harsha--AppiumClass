package com.appium_sdet10;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericutility.GenericToLaunch;
import com.genericutility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CameraApp {
@Test
public void cameraapp() throws IOException, InterruptedException
{
	GenericToLaunch got=new GenericToLaunch();
	AndroidDriver driver = got.launchapp("com.hmdglobal.camera2", "com.android.camera.CameraLauncher");
	WebDriverUtility wu = new WebDriverUtility();
	wu.implicitwait(driver);
	driver.findElementById("com.hmdglobal.camera2:id/camera_toggle_button").click();
//	driver.findElementById("com.hmdglobal.camera2:id/shutter_button").click();
	//Takes a pic
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	
	/*driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	Thread.sleep(3000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);*/
	
   }
}
