package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;

public class CountNumberOfPassangersAndTotalBaggageCommand implements CommandMenu {
	
	private TrainController trainControler;

	
	public CountNumberOfPassangersAndTotalBaggageCommand(TrainController trainController) {
		this.trainControler = trainController;
	}

	@Override
	public void execute() {
		trainControler.CountingNumberOfPassangersAndTotalBaggage();
	}

}
