package com.epam.lib.transport.menu;

public class MenuSwitcherPassangerCar {

	private CommandMenu exitProgramCommand;
	private CommandMenu addCommonPassangerCarCommand;
	private CommandMenu addCouchettePassangerCarCommand;
	private CommandMenu addCoupePassangerCarCommand;
	private CommandMenu addRestaurantPassangerCarCommand;
	private CommandMenu addSleepPassangerCarCommand;

	public MenuSwitcherPassangerCar(CommandMenu exiting,
			CommandMenu addingCommonCar,
			CommandMenu addingCoupeCar,
			CommandMenu addingCouchetteCar,
			CommandMenu addingRestaurantCar,
			CommandMenu addingSleepCar) {
		this.exitProgramCommand = exiting;
		this.addCommonPassangerCarCommand = addingCommonCar;
		this.addCouchettePassangerCarCommand = addingCoupeCar;
		this.addCoupePassangerCarCommand = addingCouchetteCar;
		this.addRestaurantPassangerCarCommand = addingRestaurantCar;
		this.addSleepPassangerCarCommand = addingSleepCar;
	}

	public void exitFrom() {
		exitProgramCommand.execute();
	}

	public void addCommonPassangerCar() {
		addCommonPassangerCarCommand.execute();
	}

	public void addCouchettePassangerCar() {
		addCouchettePassangerCarCommand.execute();
	}

	public void addCoupePassangerCar() {
		addCoupePassangerCarCommand.execute();
	}

	public void addRestaurantPassangerCar() {
		addRestaurantPassangerCarCommand.execute();
	}

	public void addSleepPassangerCar() {
		addSleepPassangerCarCommand.execute();
	}

}
