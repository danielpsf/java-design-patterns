package com.danielpsf.lab;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class FleetSpec {

	@Test
	public void fleet_should_execute_jump() throws Exception {
		HyperSpaceShip carrier = mock(Carrier.class);
		HyperSpaceShip bomber = mock(Bomber.class);
		Fleet fleet = new Fleet();
		fleet.addShip(bomber);
		fleet.addShip(carrier);
		
		fleet.jump();
		
		verify(carrier, times(1)).executeJump();
		verify(bomber, times(1)).executeJump();
	}
	
	@Test
	public void fleet_should_take_evasive_maneuver_when_jump_fail() throws Exception {
		HyperSpaceShip bomber = mock(Bomber.class);
		doThrow(new Exception()).when(bomber).executeJump();
		
		Fleet fleet = spy(Fleet.class);
		fleet.addShip(bomber);
		
		fleet.jump();
		
		verify(fleet, times(1)).takeEvasiveManeuver();
	}

}
