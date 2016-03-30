package com.epam.lib.transport.control;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.lib.transport.model.car.passanger.AbstractPassangerCar.LevelOfComfortEnum;
import com.epam.lib.transport.model.car.passanger.RestaurantPassangerCar;
import com.epam.lib.transport.model.locomotive.AbstractLocomotive;
import com.epam.lib.transport.model.locomotive.DieselLocomotive;

public class TrainControllerTest {
	
	static AbstractLocomotive locomotive;
	static TrainController controler;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		locomotive = new DieselLocomotive();
		controler = new TrainController();
	}

	@Test
	public void testAddLocomotive() {
		controler.addLocomotive(locomotive);
		assertTrue(controler.getTrain().getLocomotive()== locomotive);
	}

	@Test
	public void testAddCarPoint() {
		controler.addCarPoint(new RestaurantPassangerCar(5, 5, LevelOfComfortEnum.VIP));
		assertTrue(controler.getTrain().getCars().isEmpty()==false);
	}
}