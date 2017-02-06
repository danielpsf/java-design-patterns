package com.danielpsf.lab;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
	List<HyperSpaceShip> ships;
	
	public Fleet() {
		ships = new ArrayList<HyperSpaceShip>();
	}

	public void addShip(HyperSpaceShip ship) {
		ships.add(ship);
	}
	
	public void takeEvasiveManeuver() {
		System.out.println("Jump has failed. Execute evasive maneuvers!");
	}
	
	public void jump() {
		for (HyperSpaceShip ship : ships) {
			try {
				ship.executeJump();
			} catch (Exception e) {
				takeEvasiveManeuver();
			}
		}
	}
	
}
