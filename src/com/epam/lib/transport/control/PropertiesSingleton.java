package com.epam.lib.transport.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiesSingleton {

	public Properties properties;

	private static final Logger logger = Logger.getLogger(PropertiesSingleton.class);
	private static PropertiesSingleton propertiesSingleton;
	
	private PropertiesSingleton() throws IOException{
		properties = new Properties();
		InputStream inputStream = null;

		try{
			inputStream = new FileInputStream("config.properties");
			properties.load(inputStream);
		}catch(FileNotFoundException e){
			logger.error(e.getMessage());
		}
		catch(IOException e){
			logger.error(e.getMessage());
		}
		catch(Exception e){
			logger.error(e.getMessage());
		}
	}

	public static PropertiesSingleton getInstance(){
		if (propertiesSingleton == null){
			try {
				propertiesSingleton = new PropertiesSingleton();
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
		return propertiesSingleton;
	}
	
	public Properties getProperties() {
		return properties;
	}
}
