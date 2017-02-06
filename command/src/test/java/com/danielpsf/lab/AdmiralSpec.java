package com.danielpsf.lab;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdmiralSpec {
	private static Fleet fleet;
	private static HyperSpaceShip carrier;
	private static HyperSpaceShip bomber;
	private static Admiral admiral;
	
	@BeforeClass
	public static void setupClass() {
		fleet = mock(Fleet.class);
		carrier = mock(Carrier.class);
		bomber = mock(Bomber.class);
		admiral = new Admiral(fleet, carrier, bomber);
	}

	@Test
	public void fleet_must_be_composed_by_carriers_and_bombers() {
		verify(fleet, times(1)).addShip(carrier);
		verify(fleet, times(1)).addShip(bomber);
	}

	@Test
	public void fleet_should_jump_to_hyperspace() {
		admiral.dispatchFleet();
		
		verify(fleet, times(1)).jump();
	}
}
