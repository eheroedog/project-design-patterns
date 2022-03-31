package com.squeaker.pattern;

import com.squeaker.profiles.Squeak;

public interface Observable {
	void addFollower(Observer ob);
	void removeFollower(Observer ob);
	void notify(Squeak squeak);
}
