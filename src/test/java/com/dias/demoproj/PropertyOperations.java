package com.dias.demoproj;

import java.io.FileReader;
import java.util.Properties;

public class PropertyOperations {
	  
	public String getPropertyKey(String key) throws Exception {
		  String PropertyFileValue = null;
		  final String PROP_PATH="\\MyREPO\\dias.learning\\config.properties";
		  
		  Properties prop = null;
			// 1: Load the property for given path, if not available throw an error.
			try {
				prop = new Properties();
				FileReader file = new FileReader(PROP_PATH);
				prop.load(file);
			} catch (Exception e) {
				throw new Exception("Failed to load required property from"+ PROP_PATH);
			}

           Boolean isFileEmpty = prop.isEmpty();
           if (isFileEmpty == false) {
                 PropertyFileValue = prop.getProperty(key);
           } else {
        	   	 System.out.println("Configuration file is empty. Processing is terminated");
                 System.exit(0);
           }
          return PropertyFileValue;
        }
}
