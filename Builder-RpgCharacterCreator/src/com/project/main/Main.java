package com.project.main;

import com.project.character.RpgCharacter;
import com.project.charclasses.Mage;
import com.project.charclasses.Ranger;
import com.project.charclasses.Rogue;
import com.project.charclasses.Warrior;

public class Main {

	public static void main(String[] args) {

		//Computer test = new ComputerBuilder().setCpu("Intel i5 2500k").setMotherboard("Generic Gigabyte LGA1155").setHdd(1000).setPcCase("Generic Full tower").getComputer();
		
		System.out.println("~~~RPG Character~~~");
		boolean flag = true;
		
		RpgCharacter myCharacter = null;
		
		while(flag) {
			//System.out.println("Create new character? (Y,N)");
			System.out.println("Creating new character");
			System.out.println("Input name: ");
			var name =  System.console().readLine();
			System.out.println("Input Race: ");
			var race =  System.console().readLine();
			System.out.println("Input gender: ");
			var gender =  System.console().readLine();
			System.out.println("Choose Class (Rogue, Mage, Warrior, Ranger): ");
			var charclass =  System.console().readLine();
			
			switch (charclass.toLowerCase()) {
			case "rogue":
				myCharacter = new Rogue().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
			case "mage":
				myCharacter = new Mage().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
			case "warrior":
				myCharacter = new Warrior().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
			case "ranger":
				myCharacter = new Ranger().setName(name).setRace(race).setGender(gender).setSkills().setAttributes().setClass().build();
				break;
			default:
				break;
			}
			System.out.println("Here is your character: ");
			System.out.println(myCharacter+"\n");
			
			System.out.println("Create new character? (Y,N)");
			var message =  System.console().readLine();
			switch(message.toLowerCase()) {
				case "n":
					System.out.println("Exiting RPG Character...");
					flag = false;
					break;
				default:
					break;
			}
			
		}
	}
}
