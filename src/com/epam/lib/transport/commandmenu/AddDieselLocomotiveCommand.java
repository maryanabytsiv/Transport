package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;
import com.epam.lib.transport.model.locomotive.AbstractLocomotive;
import com.epam.lib.transport.model.locomotive.DieselLocomotive;

public class AddDieselLocomotiveCommand implements CommandMenu {
	
	private TrainController trainController;
	
	public AddDieselLocomotiveCommand(TrainController trainController) {
		this.trainController = trainController;
	}

	@Override
	public void execute() {
		AbstractLocomotive locomotive = new DieselLocomotive();
		locomotive.setSerialNumber("Diesel-654");
		trainController.addLocomotive(locomotive);
	}

}
