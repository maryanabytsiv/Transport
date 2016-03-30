package com.epam.lib.transport.commandmenu;

import com.epam.lib.transport.control.TrainController;
import com.epam.lib.transport.menu.CommandMenu;
import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar;
import com.epam.lib.transport.model.car.passanger.PassangerCarBuilder;

public class AddCommonPassangerCarCommand implements CommandMenu {
	
	private TrainController trainController;
	private PassangerCarBuilder passangerCarBuilder;

	public AddCommonPassangerCarCommand(TrainController trainController,
			PassangerCarBuilder passangerCarBuilder) {
		this.trainController = trainController;
		this.passangerCarBuilder = passangerCarBuilder;
	}

	@Override
	public void execute() {
		AbstractPassangerCar car = passangerCarBuilder.BuildCommon();
		trainController.addCarPoint(car);
	}
}
