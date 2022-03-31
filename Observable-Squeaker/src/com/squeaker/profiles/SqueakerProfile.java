package com.squeaker.profiles;

import java.util.ArrayList;
import java.util.List;

import com.squeaker.pattern.Observable;
import com.squeaker.pattern.Observer;

public class SqueakerProfile implements Observable {
	
	private String profileName;
	private List<Observer> followers = new ArrayList<>();
	private List<Squeak> history = new ArrayList<>();
	private Squeak latestSqueak;
	
	public SqueakerProfile(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public void addFollower(Observer ob) {
		followers.add(ob);		
	}

	@Override
	public void removeFollower(Observer ob) {
		followers.remove(ob);
	}

	@Override
	public void notify(Squeak sqk) {
		followers.forEach(fol -> fol.update());
	}
	
	public void newSqueak(String header, String content) {
		history.add(new Squeak(header, content));
		latestSqueak = history.get(history.size()-1);
		notify(latestSqueak);
	}

	public String getProfileName() {
		return profileName;
	}

	public Squeak getLatestSqueak() {
		return latestSqueak;
	}
	
}
