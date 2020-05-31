package com.alessandra.web.model;

public class User {
	private int clicks;
	public User() {
		this.clicks = 0;
	}
	public User(int clicks) {
		this.clicks = clicks;
	}
	public int getClicks() {
		return this.clicks;
	}
	public void addClick() {
		this.clicks++;
	}
}
