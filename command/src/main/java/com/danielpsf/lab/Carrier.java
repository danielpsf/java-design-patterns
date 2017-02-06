package com.danielpsf.lab;

public class Carrier implements HyperSpaceShip {
	private String coordinates;
	
	public Carrier() {
	}
	
	public Carrier(String coordinates) {
		this.coordinates = coordinates;
	}
	
	public void jumpToCoordinates() {
		System.out.println("Jumping to " + coordinates);
	}

	@Override
	public void executeJump() {
		jumpToCoordinates();
	}
}
