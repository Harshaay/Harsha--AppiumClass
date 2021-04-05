package com.genericutility;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartServerGeneric {
	AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
public void startserver()
{
	service.start();
}
public void stopserver()
{
	service.stop();
}
}
