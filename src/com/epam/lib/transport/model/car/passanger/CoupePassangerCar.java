package com.epam.lib.transport.model.car.passanger;

public class CoupePassangerCar extends AbstractPassangerCar{

	public CoupePassangerCar(int countOfPassangers, int countOfBaggage, LevelOfComfortEnum levelOfComfort) {
		super("Coupe car", countOfPassangers, countOfBaggage, levelOfComfort);
	}
}
