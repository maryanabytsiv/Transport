package com.epam.lib.transport.model.car.passanger;

public class SleepPassangerCar extends AbstractPassangerCar{
	
	public SleepPassangerCar(int countOfPassangers, int countOfBaggage, LevelOfComfortEnum levelOfComfort) {
		super("Sleep car", countOfPassangers, countOfBaggage, levelOfComfort);
	}
}
