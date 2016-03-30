package com.epam.lib.transport.model.train;

import java.util.Comparator;

import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar;

public class ComparatorByLevelOfComfort implements Comparator<AbstractPassangerCar> {

		@Override
		public int compare(AbstractPassangerCar car1, AbstractPassangerCar car2) {
			return car1.getLevelOfComfort().compareTo(car2.getLevelOfComfort());
		}
	}
