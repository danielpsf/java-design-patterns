package com.danielpsf.lab;

public class Bomber implements HyperSpaceShip {

	private String coordinates;
	
	public Bomber(String coordinates) {
		this.coordinates = coordinates;
	}
	
	private void heatHyperDrives() throws InterruptedException {
		Thread.sleep(100);
		System.out.println("Heating hyperdrives.");
	}
	
	public void jumpToCoordinates() {
		System.out.println("Jumping to " + coordinates);
	}

	@Override
	public void executeJump() throws InterruptedException {
		heatHyperDrives();
		jumpToCoordinates();
	}
}
