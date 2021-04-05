package com.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Harsha A Y
 *
 */

public class FileUtility {
	/**
	 * Used to get data from property file
	 * @param name
	 * @return
	 * @throws IOException
	 */

	public String ReadpropData(String name) throws IOException
	{
		FileInputStream fis = new FileInputStream(PathConstants.Property_path);
		Properties prop = new Properties();
		prop.load(fis);
		String CRED = prop.getProperty(name);
		return CRED;
	}
}
