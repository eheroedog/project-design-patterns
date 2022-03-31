package com.project.charclasses;

import java.util.ArrayList;
import java.util.List;
import com.project.character.RpgCharacter;

public class Warrior {
	
	private String name;
	private String race;
	private String charclass;
	private String gender;
	private int level;
	private List<Integer> attributes;
	private List<String> skills;

	public Warrior setName(String name) {
		this.name = name;
		return this;
	}

	public Warrior setRace(String race) {
		this.race = race;
		return this;
	}

	public Warrior setClass() {
		this.charclass = "Warrior";
		return this;
		
	}

	public Warrior setGender(String gender) {
		this.gender = gender;
		return this;
		
	}

	public Warrior setLevel() {
		this.level = 1;
		return this;
		
	}

	public Warrior setAttributes() {
		this.attributes = new ArrayList<>(List.of(17,12,12,7,6,8));
		return this;
		
	}

	public Warrior setSkills() {
		this.skills = new ArrayList<>(List.of("battle stance","pummel strike","charge","battle shout"));
		return this;
		
	}

	public RpgCharacter build() {
		return new RpgCharacter(name,race,charclass,gender,level,attributes,skills);
	}

}
