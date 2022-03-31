package com.squeaker.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import com.squeaker.profiles.SqueakerFollower;
import com.squeaker.profiles.SqueakerProfile;

public class Main {

	public static void main(String[] args) {
		SqueakerProfile profile = new SqueakerProfile("Squeaker Official!");
		List<SqueakerFollower> followers = new ArrayList<>();		
		
		Random rand = new Random();
		int xrand = rand.nextInt(10);
		
		IntStream.range(0,xrand).forEach(a -> followers.add(new SqueakerFollower(profile)) );
		followers.forEach(x -> profile.addFollower(x));
		
		profile.newSqueak("Traveling to Japan!!!", "Going to Japan for new work opportunities.");
		
	}

}
