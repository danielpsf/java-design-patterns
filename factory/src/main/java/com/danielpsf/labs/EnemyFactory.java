package com.danielpsf.labs;

import java.util.Arrays;

public class EnemyFactory {

	public static Enemy create(EnemyType alien) {
		Enemy enemy = null;
		
		switch (alien) {
			case ALIEN:
				enemy = createAlien();
				break;
		}
		
		return enemy;
	}

	/**
	 * Well, I could certainly use builder pattern to create aliens
	 * but just to not mess up with so many patterns, let create it
	 * on a spartainian way.
	 */
	private static Enemy createAlien() {
		Enemy alien = new Alien();
		
		alien.setRace(Race.MARTIAN);
		alien.setSkillSet(Arrays.asList(Skills.TELEPATHY, Skills.FLY, Skills.TELEMORPHOSIS));
		
		return alien;
	}

}
