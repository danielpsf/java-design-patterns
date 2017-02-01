package com.danielpsf.labs;

import java.util.List;

public class Alien implements Enemy {
	private Race race; 
	private List<Skills> skillSet;
	
	@Override
	public Race getRace() {
		return race;
	}
	
	@Override
	public void setRace(Race race) {
		this.race = race;
	}
	
	@Override
	public List<Skills> getSkillSet() {
		return skillSet;
	}

	@Override
	public void setSkillSet(List<Skills> skillSet) {
		this.skillSet = skillSet;
	}

}
