package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	/**
	 * This method is used to load the properties from config.properties file
	 * 
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

	// Write the data to Application property file
	public static void writeToApplicationPropertie(String strKey, String strvalue) {
		//String fName = "./src/test/resources/application.properties";
		String fName = System.getProperty("user.dir")+"/src/test/resources/application.properties";
		Properties prop = new Properties();
		OutputStream output = null;

		FileInputStream in;
		String OldValue;

		try {
			in = new FileInputStream(fName);
			OldValue = getProp(strKey, fName);

			if (OldValue != null) {
				// Replace the properties value
				prop.load(in);
				prop.replace(strKey, OldValue, strvalue);
				in.close();
				output = new FileOutputStream(fName);
				prop.store(output, null);
			} else {
				prop.load(in);
				prop.setProperty(strKey, strvalue);
				in.close();
				output = new FileOutputStream(fName);
				prop.store(output, null);
			}

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Read data from common Property file
	public static String getProp(String strProp, String fName) {

		File file = new File(fName);
		FileInputStream fileInput = null;
		Properties prop = new Properties();

		try {
			fileInput = new FileInputStream(file);
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(strProp);
	}

	public static Properties getApplicationProperties() {
		try {
			FileReader reader = new FileReader("./src/test/resources/application.properties");
			Properties prop = new Properties();
			prop.load(reader);
			return prop;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public static String getApplicationPropertie(String strProp)  {
		File file = new File("./src/test/resources/application.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(strProp);
	}

	public String getReportConfigPath() {
		Properties prop = new Properties();
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}
