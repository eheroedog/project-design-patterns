package com.project.charclasses;

import java.util.ArrayList;
import java.util.List;
import com.project.character.RpgCharacter;

public class Ranger {
	
	private String name;
	private String race;
	private String charclass;
	private String gender;
	private int level;
	private List<Integer> attributes;
	private List<String> skills;

	public Ranger setName(String name) {
		this.name = name;
		return this;
	}

	public Ranger setRace(String race) {
		this.race = race;
		return this;
	}

	public Ranger setClass() {
		this.charclass = "Ranger";
		return this;
		
	}

	public Ranger setGender(String gender) {
		this.gender = gender;
		return this;
		
	}

	public Ranger setLevel() {
		this.level = 1;
		return this;
		
	}

	public Ranger setAttributes() {
		this.attributes = new ArrayList<>(List.of(9,17,7,9,11,12));
		return this;
		
	}

	public Ranger setSkills() {
		this.skills = new ArrayList<>(List.of("track beasts","raptor strike","serpent sting","concussive shot"));
		return this;
		
	}

	public RpgCharacter build() {
		return new RpgCharacter(name,race,charclass,gender,level,attributes,skills);
	}

}
