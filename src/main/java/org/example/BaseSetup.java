package org.example;
import java.io.IOException;
import java.util.Properties;

import org.example.utils.APIHelpers;
import org.example.utils.Utilities;


/**
 * This page class is intended to have the base setup for API automation framework
 * consists of basic properties setup
 * 
 * @return null
 */

public class BaseSetup {
	public static Properties prop = null;
	  public static Utilities utilities = new Utilities();
	  public static APIHelpers apiHelpers = new APIHelpers();
	  
	public static String baseURL = "";
    
	public static void baseConfigurationSetup() throws IOException
	{		prop= utilities.readPropertiesFile("TestData.properties");
   
	        baseURL = prop.getProperty("endpointURL");

	}

}
