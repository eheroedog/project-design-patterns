package com.project.charclasses;

import java.util.ArrayList;
import java.util.List;
import com.project.character.RpgCharacter;

public class Mage {
	
	private String name;
	private String race;
	private String charclass;
	private String gender;
	private int level;
	private List<Integer> attributes;
	private List<String> skills;

	public Mage setName(String name) {
		this.name = name;
		return this;
	}

	public Mage setRace(String race) {
		this.race = race;
		return this;
	}

	public Mage setClass() {
		this.charclass = "Mage";
		return this;
		
	}

	public Mage setGender(String gender) {
		this.gender = gender;
		return this;
		
	}

	public Mage setLevel() {
		this.level = 1;
		return this;
		
	}

	public Mage setAttributes() {
		this.attributes = new ArrayList<>(List.of(8,9,8,16,12,8));
		return this;
		
	}

	public Mage setSkills() {
		this.skills = new ArrayList<>(List.of("fireball","frost armor","arcane intellect","conjure water"));
		return this;
		
	}

	public RpgCharacter build() {
		return new RpgCharacter(name,race,charclass,gender,level,attributes,skills);
	}

}
