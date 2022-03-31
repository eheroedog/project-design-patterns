package com.squeaker.profiles;

public class Squeak {
	private String header;
	private String content;
	private int likes;
	private int reSqueak;
	
	public Squeak(String header, String content) {
		super();
		this.header = header;
		this.content = content;
		this.likes = 0;
		this.reSqueak = 0;
	}

	public String getHeader() {
		return header;
	}

	public String getContent() {
		return content;
	}

	public int getLikes() {
		return likes;
	}

	public int getReSqueak() {
		return reSqueak;
	}


}
