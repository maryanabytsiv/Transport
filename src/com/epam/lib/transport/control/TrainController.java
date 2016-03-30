package com.epam.lib.transport.control;

import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar;
import com.epam.lib.transport.model.locomotive.AbstractLocomotive;
import com.epam.lib.transport.model.train.Train;

import jdk.nashorn.internal.objects.annotations.Getter;

public class TrainController {

	private Train train = new Train();

	public Train getTrain() {
		return train;
	}
	

	public void addLocomotive(AbstractLocomotive locomotive) {
		train.addLocomotive(locomotive);
	}

	public void addCarPoint(AbstractPassangerCar car) {
		train.addCar(car);
	}

	public void CountingNumberOfPassangersAndTotalBaggage() {
		System.out.println("\nTotal in train: "
				+ train.getTotalCountOfPassangers() + "passangers and "
				+ train.getTotalCountOfBaggage() + "kg of baggage");
	}

	public void SortCarsByLevelOfComfort(boolean betterFromHead) {
		train.sortByLevelOfComfort(betterFromHead);
	}

	public void exit() {
		System.out.println("Program was closed");
		System.exit(0);
	}
}
