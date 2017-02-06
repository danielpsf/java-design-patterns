package com.danielpsf.lab;

public class Admiral {
	
	//TODO: Remove main method and add commandFleet method
	public static void main(String[] args) {
		HyperSpaceShip carrier = new Carrier("Coruscant");
		HyperSpaceShip bomber = new Bomber("Coruscant");
		
		Fleet fleet = new Fleet();
		
		fleet.addShip(carrier);
		fleet.addShip(bomber);
		
		fleet.jump();
	}

}
