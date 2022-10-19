package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

      public class ConfigDataProvider {
	Properties prop;
	
	//this is a method that bears the name of the constructor class.methods can have the name of the class	//this is a method that bears the name of the constructor class.methods can have the name of the class
     public ConfigDataProvider() {
    	 try {
			File src = new File("./Configuration/config.properties");
			 FileInputStream fis = new FileInputStream(src);
			 prop = new Properties();
			 prop.load(fis);
		} catch (Exception e) {
			System.out.println("unable to read config file");
		} 
		}
		

      public String getBrowser() {
    	  return prop.getProperty("browser");
    	  

}
      public String getUrl() {
    	  return prop.getProperty("url");
      }
      }