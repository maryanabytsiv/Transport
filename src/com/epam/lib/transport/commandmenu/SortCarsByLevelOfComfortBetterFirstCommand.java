package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;

public class SortCarsByLevelOfComfortBetterFirstCommand implements CommandMenu {
	
	private TrainController trainControler;
	
	public SortCarsByLevelOfComfortBetterFirstCommand(TrainController trainControler) {
		this.trainControler = trainControler;
	}

	@Override
	public void execute() {
		trainControler.SortCarsByLevelOfComfort(true);
	}
}
