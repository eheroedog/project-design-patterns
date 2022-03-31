package com.project.character;

import java.util.List;

public class RpgCharacter {
	
	private String name;
	private String race;
	private String charclass;
	private String gender;
	private int level;
	private List<Integer> attributes;
	private List<String> skills;
	
	public RpgCharacter(String name, String race, String charclass, String gender, int level, List<Integer> attributes,
			List<String> skills) {
		super();
		this.name = name;
		this.race = race;
		this.charclass = charclass;
		this.gender = gender;
		this.level = level;
		this.attributes = attributes;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Race = " + race + ", Class = " + charclass + ", Gender = " + gender
				+ ", Level = " + level + ", Attributes(Strength,Dexterity,Intelligence,Wisdom,Charisma) = " + attributes + ", Skills = " + skills;
	}
	
	
	
}
