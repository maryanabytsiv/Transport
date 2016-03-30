package com.epam.lib.transport.menu;

import com.epam.lib.transport.commandmenu.AddCommonPassangerCarCommand;
import com.epam.lib.transport.commandmenu.AddCouchettePassangerCarCommand;
import com.epam.lib.transport.commandmenu.AddCoupePassangerCarCommand;
import com.epam.lib.transport.commandmenu.AddDieselLocomotiveCommand;
import com.epam.lib.transport.commandmenu.AddElectricLocomotiveCommand;
import com.epam.lib.transport.commandmenu.AddRestaurantPassangerCarCommand;
import com.epam.lib.transport.commandmenu.AddSleepPassangerCarCommand;
import com.epam.lib.transport.commandmenu.CountNumberOfPassangersAndTotalBaggageCommand;
import com.epam.lib.transport.commandmenu.ExitCommand;
import com.epam.lib.transport.commandmenu.FindCarsByRangeOfCountOfPassangersCommand;
import com.epam.lib.transport.commandmenu.SortCarsByLevelOfComfortBetterFirstCommand;
import com.epam.lib.transport.commandmenu.SortCarsByLevelOfComfortBetterLastCommand;
import com.epam.lib.transport.control.InputNumberException;
import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.control.ScannerOfMenuInputSingleton;
import com.epam.lib.transport.model.car.passanger.PassangerCarBuilder;

public class Menu {
	
	private TrainController trainController;
	private PassangerCarBuilder passangerCarBuilder;

	public void trainOnScreen() {
		trainController.getTrain().buildTrainOnScreen();
	}

	public Menu(TrainController receiver,
			PassangerCarBuilder passangerCarBuilder) {
		this.trainController = receiver;
		this.passangerCarBuilder = passangerCarBuilder;
	}

	public void goToMainMenu() {

		System.out.println("\nMenu =>");
		System.out.println("0: Exit");
		System.out.println("1: Add locomotive...");
		System.out.println("2: Add car...");

		if (!trainController.getTrain().getCars().isEmpty()) {
			System.out.println("3: Build train");
			System.out.println("4: Count number of passangers and baggage");
			System.out.println("5: Sorting cars by level of comfort...");
			System.out.println("6: Find cars by range of passangers number...");
		}

		CommandMenu exiting = new ExitCommand(trainController);
		CommandMenu countingNumberOfPassangersAndTotalBaggage = new CountNumberOfPassangersAndTotalBaggageCommand(
				trainController);
		CommandMenu findingCarsByRangeOfCountOfPassangers = new FindCarsByRangeOfCountOfPassangersCommand(
				trainController);

		int inputValueOfMenuPointFromKeyBoard = 0;
		MenuSwitcherMain menuSwitcherMain = new MenuSwitcherMain(exiting, countingNumberOfPassangersAndTotalBaggage, findingCarsByRangeOfCountOfPassangers);

		while (true) {
			try{
				inputValueOfMenuPointFromKeyBoard = ScannerOfMenuInputSingleton
						.getInstance().getNumber("");
			}catch (InputNumberException e){
				e.getError();
				continue;
			}

			switch (inputValueOfMenuPointFromKeyBoard) {
			case 0:
				menuSwitcherMain.exitFrom();
				break;
			case 1:
				goToSubMenuAddLocomotive();
				break;
			case 2:
				goToSubMenuAddCar();
				break;
			case 3:
				trainOnScreen();
				break;
			case 4:
				menuSwitcherMain.countPassangersAndBaggage();
				break;
			case 5:
				gotoSubMenuSorting();
				break;
			case 6:
				menuSwitcherMain.findCarsByRangeOfPassangersCount();
				break;
			default:
				System.out
				.println("You entered wrong number of menu point. \nTry again...");
			}
		}
	}

	private void gotoSubMenuSorting() {
		System.out.println("	=> Select sorting order:");
		System.out.println("	0: Exit");
		System.out.println("	1: Better first");
		System.out.println("	2: Better last");

		CommandMenu exiting = new ExitCommand(trainController);
		CommandMenu sortingCarsByLevelOfComfortBetterFirst = new SortCarsByLevelOfComfortBetterFirstCommand(
				trainController);
		CommandMenu sortingCarsByLevelOfComfortBetterLast = new SortCarsByLevelOfComfortBetterLastCommand(
				trainController);

		int inputValueOfMenuPointFromKeyBoard = 0;
		MenuSwitcherSortByLevelOfComfort menuSwitcherSortByLevelOfComfort = new MenuSwitcherSortByLevelOfComfort(
				exiting, sortingCarsByLevelOfComfortBetterFirst, sortingCarsByLevelOfComfortBetterLast);

		while (true) {
			try {
				inputValueOfMenuPointFromKeyBoard = ScannerOfMenuInputSingleton
						.getInstance().getNumber("");
			} catch (InputNumberException e) {
				e.getError();
				continue;
			}

			switch (inputValueOfMenuPointFromKeyBoard) {
			case 0:
				menuSwitcherSortByLevelOfComfort.exitFrom();
				break;
			case 1:
				menuSwitcherSortByLevelOfComfort.sortingCarsByLevetOfComfortBetterFirst();
				trainOnScreen();
				goToMainMenu();
				break;
			case 2:
				menuSwitcherSortByLevelOfComfort.sortingCarsByLevetOfComfortBetterLast();
				trainOnScreen();
				goToMainMenu();
				break;
			default:
				System.out
				.println("You entered wrong number of menu point. \nTry again");
			}
		}


	}

	public void goToSubMenuAddLocomotive() {

		System.out.println("	=> Choosing type of locomotive:");
		System.out.println("	0: Exit");
		System.out.println("	1: Diesel locomotive");
		System.out.println("	2: Electric locomotive");

		CommandMenu exiting = new ExitCommand(trainController);
		CommandMenu addingDieselLocomotive = new AddDieselLocomotiveCommand(
				trainController);
		CommandMenu addingElectricLocomotive = new AddElectricLocomotiveCommand(
				trainController);

		int inputValueOfMenuPointFromKeyBoard = 0;
		MenuSwitcherLocomotive menuSwitcherLocomotive = new MenuSwitcherLocomotive(
				exiting, addingElectricLocomotive, addingDieselLocomotive);

		while (true) {
			try {
				inputValueOfMenuPointFromKeyBoard = ScannerOfMenuInputSingleton
						.getInstance().getNumber("");
			} catch (InputNumberException e) {
				e.getError();
				continue;
			}

			switch (inputValueOfMenuPointFromKeyBoard) {
			case 0:
				menuSwitcherLocomotive.exitFrom();
				break;
			case 1:
				menuSwitcherLocomotive.addElectricLocomotive();
				trainOnScreen();
				goToMainMenu();
				break;
			case 2:
				menuSwitcherLocomotive.addDieselLocomotive();
				trainOnScreen();
				goToMainMenu();
				break;
			default:
				System.out
				.println("You entered wrong number of menu point. \nTry again");
			}
		}
	}

	public void goToSubMenuAddCar() {
		System.out.println("	=>Choose type of car:");
		System.out.println("	0: Exit");
		System.out.println("	1: Common car");
		System.out.println("	2: Coupe car");
		System.out.println("	3: Couchette car");
		System.out.println("	4: Restaurant car");
		System.out.println("	5: Sleep (SV) car");
		System.out.println("	6: go to main menu...");

		CommandMenu exiting = new ExitCommand(trainController);
		CommandMenu addingCommonCar = new AddCommonPassangerCarCommand(
				trainController, passangerCarBuilder);
		CommandMenu addingCoupeCar = new AddCoupePassangerCarCommand(trainController,
				passangerCarBuilder);
		CommandMenu addingCouchetteCar = new AddCouchettePassangerCarCommand(
				trainController, passangerCarBuilder);
		CommandMenu addingRestaurantCar = new AddRestaurantPassangerCarCommand(
				trainController, passangerCarBuilder);
		CommandMenu addingSleepCar = new AddSleepPassangerCarCommand(trainController,
				passangerCarBuilder);
		int inputValueOfMenuPointFromKeyBoard = 0;

		MenuSwitcherPassangerCar menuSwitcherPassangerCar = new MenuSwitcherPassangerCar(
				exiting, addingCommonCar, addingCoupeCar, addingCouchetteCar,
				addingRestaurantCar, addingSleepCar);

		while (true) {
			try {
				inputValueOfMenuPointFromKeyBoard = ScannerOfMenuInputSingleton
						.getInstance().getNumber("");
			} catch (InputNumberException e) {
				e.getError();
				continue;
			}

			switch (inputValueOfMenuPointFromKeyBoard) {
			case 0:
				menuSwitcherPassangerCar.exitFrom();
				break;
			case 1:
				menuSwitcherPassangerCar.addCommonPassangerCar();
				trainOnScreen();
				break;
			case 2:
				menuSwitcherPassangerCar.addCouchettePassangerCar();
				trainOnScreen();
				break;
			case 3:
				menuSwitcherPassangerCar.addCoupePassangerCar();
				trainOnScreen();
				break;
			case 4:
				menuSwitcherPassangerCar.addRestaurantPassangerCar();
				trainOnScreen();
				break;
			case 5:
				menuSwitcherPassangerCar.addSleepPassangerCar();
				trainOnScreen();
				break;
			case 6:
				goToMainMenu();
				break;
			default:
				System.out
				.println("You entered wrong number of menu point. \nTry again");
			}
		}
	}
}
