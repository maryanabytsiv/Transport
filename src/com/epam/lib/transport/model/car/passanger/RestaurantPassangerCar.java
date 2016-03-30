package com.epam.lib.transport.model.car.passanger;

public class RestaurantPassangerCar extends AbstractPassangerCar {
	
	public RestaurantPassangerCar(int countOfPassangers, int countOfBaggage, LevelOfComfortEnum levelOfComfort) {
		super("Restaurant car", countOfPassangers, countOfBaggage, levelOfComfort);
	}
}
