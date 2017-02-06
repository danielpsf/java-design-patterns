package com.danielpsf.lab;

public class Admiral {
	Fleet fleet;
	
	public Admiral() {
		HyperSpaceShip carrier = new Carrier("Coruscant");
		HyperSpaceShip bomber = new Bomber("Coruscant");
		
		fleet = new Fleet();
		
		fleet.addShip(carrier);
		fleet.addShip(bomber);
	}
	
	public Admiral(Fleet fleet, HyperSpaceShip carrier, HyperSpaceShip bomber) {
		this.fleet = fleet;
		this.fleet.addShip(carrier);
		this.fleet.addShip(bomber);
	}
		
	public void dispatchFleet() {
		fleet.jump();
	}
}
