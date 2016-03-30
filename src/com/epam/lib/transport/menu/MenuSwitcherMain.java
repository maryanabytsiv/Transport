package com.epam.lib.transport.menu;

public class MenuSwitcherMain {

	private CommandMenu exitProgramCommand;
	private CommandMenu countingNumberOfPassangersAndTotalBaggage;
	private CommandMenu findingCarsByRangeOfCountOfPassangers;

	public MenuSwitcherMain(CommandMenu exiting,
			CommandMenu countingNumberOfPassangersAndTotalBaggage2,
			CommandMenu findingCarsByRangeOfCountOfPassangers2) {
		this.exitProgramCommand = exiting;
		this.countingNumberOfPassangersAndTotalBaggage = countingNumberOfPassangersAndTotalBaggage2;
		this.findingCarsByRangeOfCountOfPassangers = findingCarsByRangeOfCountOfPassangers2;
	}

	public void exitFrom() {
		exitProgramCommand.execute();
	}

	public void countPassangersAndBaggage() {
		countingNumberOfPassangersAndTotalBaggage.execute();
	}
	
	public void findCarsByRangeOfPassangersCount() {
		findingCarsByRangeOfCountOfPassangers.execute();
	}
}