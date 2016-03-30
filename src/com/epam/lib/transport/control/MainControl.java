package com.epam.lib.transport.control;

import com.epam.lib.transport.menu.Menu;
import com.epam.lib.transport.model.car.passanger.PassangerCarBuilder;

public class MainControl {

	public static void main(String[] args) {

		TrainController trainController = new TrainController();
		PassangerCarBuilder passangerCarBuilder = new PassangerCarBuilder();
		Menu menu = new Menu(trainController, passangerCarBuilder);
		menu.goToMainMenu();

	}
}