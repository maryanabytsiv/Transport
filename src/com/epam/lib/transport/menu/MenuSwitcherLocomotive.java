package com.epam.lib.transport.menu;

public class MenuSwitcherLocomotive {

	private CommandMenu exitProgramCommand;
	private CommandMenu addDieselLocomotiveCommand;
	private CommandMenu addElectricLocomotiveCommand;

	public MenuSwitcherLocomotive(CommandMenu exiting,
			CommandMenu addingElectricLocomotive,
			CommandMenu addingDieselLocomotive) {
		this.exitProgramCommand = exiting;
		this.addDieselLocomotiveCommand = addingElectricLocomotive;
		this.addElectricLocomotiveCommand = addingDieselLocomotive;
	}

	public void addDieselLocomotive() {
		addDieselLocomotiveCommand.execute();
	}

	public void addElectricLocomotive() {
		addElectricLocomotiveCommand.execute();
	}
	
	public void exitFrom() {
		exitProgramCommand.execute();
	}

}
