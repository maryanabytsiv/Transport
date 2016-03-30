package com.epam.lib.transport.model.car.passanger;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.epam.lib.transport.control.InputNumberException;
import com.epam.lib.transport.control.PropertiesSingleton;
import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar.LevelOfComfortEnum;

public class PassangerCarBuilder {
	
	private static final Logger logger = Logger.getLogger(InputNumberException.class);
	
	public CommonPassangerCar BuildCommon(){
		int countOfPassangers = Integer.parseInt(getProperty("car.common.passangercount"));
		int countOfBaggage = Integer.parseInt(getProperty("car.common.baggagecount"));
		LevelOfComfortEnum levelOfComfort = LevelOfComfortEnum.valueOf(getProperty("car.common.levelofcomfort"));

		return new CommonPassangerCar(countOfPassangers, countOfBaggage, levelOfComfort);
	}

	public CouchettePassangerCar BuildCouchette(){
		int countOfPassangers = Integer.parseInt(getProperty("car.couchette.passangercount"));
		int countOfBaggage = Integer.parseInt(getProperty("car.couchette.baggagecount"));
		LevelOfComfortEnum levelOfComfort = LevelOfComfortEnum.valueOf(getProperty("car.couchette.levelofcomfort"));

		return new CouchettePassangerCar(countOfPassangers, countOfBaggage, levelOfComfort);
	}

	public CoupePassangerCar BuildCoupe(){
		int countOfPassangers = Integer.parseInt(getProperty("car.coupe.passangercount"));
		int countOfBaggage = Integer.parseInt(getProperty("car.coupe.baggagecount"));
		LevelOfComfortEnum levelOfComfort = LevelOfComfortEnum.valueOf(getProperty("car.coupe.levelofcomfort"));

		return new CoupePassangerCar(countOfPassangers, countOfBaggage, levelOfComfort);
	}

	public RestaurantPassangerCar BuildRestaurant(){
		int countOfPassangers = Integer.parseInt(getProperty("car.restaurant.passangercount"));
		int countOfBaggage = Integer.parseInt(getProperty("car.restaurant.baggagecount"));
		LevelOfComfortEnum levelOfComfort = LevelOfComfortEnum.valueOf(getProperty("car.restaurant.levelofcomfort"));

		return new RestaurantPassangerCar(countOfPassangers, countOfBaggage, levelOfComfort);
	}

	public SleepPassangerCar BuildSleep(){
		int countOfPassangers = Integer.parseInt(getProperty("car.sleep.passangercount"));
		int countOfBaggage = Integer.parseInt(getProperty("car.sleep.baggagecount"));
		LevelOfComfortEnum levelOfComfort = LevelOfComfortEnum.valueOf(getProperty("car.sleep.levelofcomfort"));

		return new SleepPassangerCar(countOfPassangers, countOfBaggage, levelOfComfort);
	}

	public String getProperty(String propertyName){
		Properties properties = PropertiesSingleton.getInstance().properties;
		String gettedProperties = "";
		gettedProperties = properties.getProperty(propertyName);		
		if (gettedProperties == null) {
			System.out.println("Wrong fill of property file. Look at log file.");
			logger.fatal("Wrong fill of property file. Wrong property: " + propertyName);
			System.out.println("Program closed");
			System.exit(0);
		}
		return gettedProperties;
	}
}
