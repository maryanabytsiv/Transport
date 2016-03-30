package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;
import com.epam.lib.transport.model.locomotive.AbstractLocomotive;
import com.epam.lib.transport.model.locomotive.ElectricLocomotive;

public class AddElectricLocomotiveCommand implements CommandMenu {
	
	private TrainController trainController;

	public AddElectricLocomotiveCommand(TrainController trainController) {
		this.trainController = trainController;
	}

	@Override
	public void execute() {
		AbstractLocomotive locomotive = new ElectricLocomotive();
		locomotive.setSerialNumber("Electric-111");
		trainController.addLocomotive(locomotive);
	}

}
