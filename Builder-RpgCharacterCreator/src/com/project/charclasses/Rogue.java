package com.project.charclasses;

import java.util.ArrayList;
import java.util.List;
import com.project.character.RpgCharacter;

public class Rogue {
	
	private String name;
	private String race;
	private String charclass;
	private String gender;
	private int level;
	private List<Integer> attributes;
	private List<String> skills;

	public Rogue setName(String name) {
		this.name = name;
		return this;
	}

	public Rogue setRace(String race) {
		this.race = race;
		return this;
	}

	public Rogue setClass() {
		this.charclass = "Rogue";
		return this;
		
	}

	public Rogue setGender(String gender) {
		this.gender = gender;
		return this;
		
	}

	public Rogue setLevel() {
		this.level = 1;
		return this;
		
	}

	public Rogue setAttributes() {
		this.attributes = new ArrayList<>(List.of(10,15,9,9,10,12));
		return this;
		
	}

	public Rogue setSkills() {
		this.skills = new ArrayList<>(List.of("pick lock","stealth"," backstab","eviscerate"));
		return this;
		
	}

	public RpgCharacter build() {
		return new RpgCharacter(name,race,charclass,gender,level,attributes,skills);
	}

}
