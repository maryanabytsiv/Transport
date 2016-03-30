package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;

public class ExitCommand implements CommandMenu {
	
	private TrainController trainController;
	
	public ExitCommand(TrainController trainController) {
		this.trainController = trainController;
	}

	@Override
	public void execute() {
		trainController.exit();
	}

}