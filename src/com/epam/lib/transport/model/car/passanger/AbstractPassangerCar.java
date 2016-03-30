package com.epam.lib.transport.model.car.passanger;

import com.epam.lib.transport.model.car.AbstractCar;

public abstract class AbstractPassangerCar extends AbstractCar {

	public enum LevelOfComfortEnum {
		VIP, HIGH, MEDIUM, LOW, NONE};

		protected String typeName;
		protected int countOfPassangers;
		protected int countOfBaggage;
		protected LevelOfComfortEnum levelOfComfort;

		protected AbstractPassangerCar(String typeOfPassangerCar, int countOfPassangers, int countOfBaggage, LevelOfComfortEnum levelOfComfort) {
			this.typeName = typeOfPassangerCar;
			this.countOfPassangers = countOfPassangers;
			this.countOfBaggage = countOfBaggage;
			this.levelOfComfort = levelOfComfort;	
		}

		public int getCountOfPassangers() {
			return countOfPassangers;
		}

		public int getCountOfBaggage() {
			return countOfBaggage;
		}

		public LevelOfComfortEnum getLevelOfComfort() {
			return levelOfComfort;
		}

		public String getTypeOfPassangerCar() {
			return typeName;
		}

		public void setCountOfBaggage(int countOfBaggage) {
			this.countOfBaggage = countOfBaggage;
		}

		public void setCountOfPassangers(int countOfPassangers) {
			this.countOfPassangers = countOfPassangers;
		}

		public void setLevelOfComfort(LevelOfComfortEnum levelOfComfort) {
			this.levelOfComfort = levelOfComfort;
		}

		public void setTypeOfPassangerCar(String typeOfPassangerCar) {
			this.typeName = typeOfPassangerCar;
		}
}
