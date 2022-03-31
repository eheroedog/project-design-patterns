package com.squeaker.profiles;

import com.squeaker.pattern.Observer;

public class SqueakerFollower implements Observer {
	
	private SqueakerProfile follProf;
	
	public SqueakerFollower(SqueakerProfile ob) {
		this.follProf = ob;
	}
	
	@Override
	public void update() {
		var sqk = follProf.getLatestSqueak();
		System.out.println("New Squeak from: " + follProf.getProfileName() );
		System.out.println(sqk.getHeader());
	}
	
	
}
