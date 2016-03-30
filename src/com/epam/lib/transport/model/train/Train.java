package com.epam.lib.transport.model.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar;
import com.epam.lib.transport.model.locomotive.AbstractLocomotive;

public class Train {

	private List<AbstractPassangerCar> cars = new ArrayList<AbstractPassangerCar>();
	private AbstractLocomotive locomotive;

	public AbstractLocomotive getLocomotive() {
		return locomotive;
	}

	public List<AbstractPassangerCar> getCars() {
		return cars;
	}

	public void addLocomotive(AbstractLocomotive locomotive) {
		this.locomotive = locomotive;
	}

	public void removeLocomotive(AbstractLocomotive locomotive) {
		this.locomotive = null;
	}

	public void removeCar(AbstractPassangerCar car) {
		cars.remove(car);
	}

	public void addCar(AbstractPassangerCar car) {
		cars.add(car);
	}

	public int getTotalCountOfBaggage() {
		int totalCountOfBaggage = 0;

		for (AbstractPassangerCar car : cars) {
			totalCountOfBaggage += car.getCountOfBaggage()
					* car.getCountOfPassangers();
		}
		return totalCountOfBaggage;
	}

	public int getTotalCountOfPassangers() {
		int totalCountOfPassangers = 0;

		for (AbstractPassangerCar car : cars) {
			totalCountOfPassangers += car.getCountOfPassangers();
		}
		return totalCountOfPassangers;
	}

	public void sortByLevelOfComfort(boolean fromHead) {
		Collections.sort(cars, new ComparatorByLevelOfComfort());
		if (!(fromHead)) {
			Collections.reverse(cars);
		}
	}

	public List<AbstractPassangerCar> findCars(int minPassangerCount,
			int maxPassangerCount) {
		List<AbstractPassangerCar> carsWithMaxMinPassangers = new ArrayList<AbstractPassangerCar>();

		for (AbstractPassangerCar car : cars) {
			if ((car.getCountOfPassangers() >= minPassangerCount)
					&& (car.getCountOfPassangers() <= maxPassangerCount)) {
				carsWithMaxMinPassangers.add(car);
			}
		}
		return carsWithMaxMinPassangers;
	}

	public void buildTrainOnScreen() {
		String stringTrain = "";
		if (locomotive == null) {
			stringTrain = stringTrain + "<no locomotive>\n";
		} else {
			stringTrain = stringTrain + "||" + getLocomotive().getSerialNumber() + ">\n";
		}
		for (AbstractPassangerCar car : this.cars) {
			stringTrain = stringTrain + "|| " + car.getTypeOfPassangerCar()
					+ " " + car.getCountOfPassangers() + "pass. in "
					+ car.getCountOfBaggage() + "kg "
					+ car.getLevelOfComfort() + " ||\n";
		}
		System.out.print(stringTrain);
	}
}
