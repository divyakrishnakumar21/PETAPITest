package org.example.utils;



import org.example.BaseSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Properties;

/**
 * This class has all the utilities used for the project
 * These utility classes can be used by other page classes
 * 
 * @return null
 */
public class Utilities extends BaseSetup {


	public static Properties prop = null;

	/**
	 * This method is intended to load all properties
	 * @return
	 */	
	public Properties readPropertiesFile(String filename) throws IOException {

        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/" + filename)) {
            System.out.println("path " + System.getProperty("user.dir") + "/src/test/resources/" + filename);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
           System.out.println("Exception occurred reading file");
        }
		return prop;
	}

	/**
	 * This method is intended to load all properties declared in src/test/resources/TestData.properties
	 * returns timestamp as a String
	 * @return
	 */	
	public String getCurrentTimeStamp()
	{
		Timestamp instant= Timestamp.from(Instant.now()); 
		String timestamp = instant.toString().replace("-", "_").replace(" ", "_").replace(":", "_").replace(".", "_");
		System.out.println("Current Timestamp is -- "+instant.toString());
		return timestamp;
	}

	public String generateStringFromResource(String path) throws IOException {

		return new String(Files.readAllBytes(Paths.get(path)));

	}

}
