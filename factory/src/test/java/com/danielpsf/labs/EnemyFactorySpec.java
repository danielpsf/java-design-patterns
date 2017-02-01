package com.danielpsf.labs;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

import com.danielpsf.labs.Alien;
import com.danielpsf.labs.Enemy;
import com.danielpsf.labs.EnemyFactory;
import com.danielpsf.labs.EnemyType;
import com.danielpsf.labs.Race;
import com.danielpsf.labs.Skills;

public class EnemyFactorySpec {
	private static Enemy alien;
	
	@BeforeClass
	public static void setupClass() {
		alien = EnemyFactory.create(EnemyType.ALIEN);
	}

	@Test
	public void should_create_an_alien_enemy() {
		assertThat(alien, is(instanceOf(Alien.class)));
	}
	
	@Test
	public void aliens_should_be_martians() {
		assertThat(alien.getRace(), is(Race.MARTIAN));
	}

	@Test
	public void aliens_should_have_a_specific_sort_of_skillset() {
		assertThat(alien.getSkillSet(), hasItems(Skills.FLY, Skills.TELEMORPHOSIS, Skills.TELEPATHY));
	}
}
