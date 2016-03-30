package com.epam.lib.transport.menu;

public class MenuSwitcherSortByLevelOfComfort {

	private CommandMenu exitProgramCommand;
	private CommandMenu sortingCarsByLevetOfComfortBetterFirst;
	private CommandMenu sortingCarsByLevetOfComfortBetterLast;
	
	public MenuSwitcherSortByLevelOfComfort(CommandMenu exiting,
			CommandMenu sortingCarsByLevelOfComfortBetterFirst,
			CommandMenu sortingCarsByLevelOfComfortBetterLast) {
		this.exitProgramCommand = exiting;
		this.sortingCarsByLevetOfComfortBetterFirst = sortingCarsByLevelOfComfortBetterFirst;
		this.sortingCarsByLevetOfComfortBetterLast = sortingCarsByLevelOfComfortBetterLast;
	}

	public void exitFrom() {
		exitProgramCommand.execute();
	}
	
	public void sortingCarsByLevetOfComfortBetterFirst() {
		sortingCarsByLevetOfComfortBetterFirst.execute();
	}
	
	public void sortingCarsByLevetOfComfortBetterLast() {
		sortingCarsByLevetOfComfortBetterLast.execute();
	}

}
