package com.epam.lib.transport.commandmenu;

import java.util.List;

import com.epam.lib.transport.control.InputNumberException;
import com.epam.lib.transport.control.ScannerOfMenuInputSingleton;
import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;
import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar;

public class FindCarsByRangeOfCountOfPassangersCommand implements CommandMenu{

	private TrainController trainControler;

	public FindCarsByRangeOfCountOfPassangersCommand(
			TrainController trainControler) {
		this.trainControler = trainControler;
	}

	@Override
	public void execute() {
		System.out
				.println("Enter your range of passangers count in car [min,max]:");
		int min;
		int max;
		boolean toExit = false;
		while (!toExit) {
			try {
				min = ScannerOfMenuInputSingleton.getInstance().getNumber(
						"min = ");
			} catch (InputNumberException se) {
				se.getError();
				continue;
			}

			try {
				max = ScannerOfMenuInputSingleton.getInstance().getNumber(
						"max = ");
			} catch (InputNumberException se) {
				se.getError();
				continue;
			}

			if ((max < min)) {
				System.out
						.println("You entered not correct range, where (max > min).\nTry again");
				continue;
			}

			toExit = true;
			System.out.println();
			System.out.println("Your range [" + min + "," + max + "].");
			List<AbstractPassangerCar> findedCars = trainControler.getTrain()
					.findCars(min, max);
			if (findedCars.isEmpty()) {
				System.out.println("There is no such cars:");
			} else {
				System.out.println("Finded cars:");
				for (AbstractPassangerCar car : findedCars) {
					System.out.println("|| " + car.getTypeOfPassangerCar()
							+ car.getCountOfBaggage() + "kg "
							+ car.getCountOfPassangers() + "pass. ||");
				}
			}
		}
	}
}
