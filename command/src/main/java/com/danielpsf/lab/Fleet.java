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
	
	public void jump() {
		for (HyperSpaceShip ship : ships) {
			try {
				ship.executeJump();
			} catch (InterruptedException e) {
				System.out.println("Jump has failed. Execute evasive maneuvers!");
			}
		}
	}
	
}
