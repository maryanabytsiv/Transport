package com.epam.lib.transport.model.car.passanger;

public class CouchettePassangerCar extends AbstractPassangerCar {

	public CouchettePassangerCar(int countOfPassangers, int countOfBaggage,
			LevelOfComfortEnum levelOfComfort) {
		super("Couchette car", countOfPassangers, countOfBaggage,
				levelOfComfort);

	}
}
