package com.epam.lib.transport.model.car.passanger;

public class CommonPassangerCar extends AbstractPassangerCar {

	public CommonPassangerCar(int countOfPassangers, int countOfBaggage,
			LevelOfComfortEnum levelOfComfort) {
		super("Common car", countOfPassangers, countOfBaggage, levelOfComfort);
	}

}
