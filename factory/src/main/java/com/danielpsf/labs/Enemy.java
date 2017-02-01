package com.danielpsf.labs;

import java.util.List;

public interface Enemy {

	public Race getRace();
	public void setRace(Race martian);
	public List<Skills> getSkillSet();
	public void setSkillSet(List<Skills> asList);

}
