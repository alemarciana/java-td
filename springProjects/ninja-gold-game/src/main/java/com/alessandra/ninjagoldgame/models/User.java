package com.alessandra.ninjagoldgame.models;

import java.util.Random;
import java.util.ArrayList;

public class User {
	private Integer gold;
	private Random random = new Random(System.currentTimeMillis());
	private ArrayList<String> logs = new ArrayList<String>();
	public User() {
		gold = 0;
	}
	public void addGold(int num) {
		gold += num; 
	}
	public void removeGold(int num) {
		gold -= num;
	}
	public Integer getGold() {
		return gold;
	}
	public void addLogs(String log) {
		logs.add(log);
	}
	public ArrayList<String> getLogs(){
		return this.logs;
	}
	public void goSomewhere(String destination) {
		int goldDifference = 0;
		String color = null;
		switch (destination) {
			case "farm":
				goldDifference = random.nextInt(11) + 10;
				color = "has-text-success";
				break;
			case "cave":
				goldDifference = random.nextInt(6) + 5;
				color = "has-text-success";
				break;
			case "house":
				goldDifference = random.nextInt(4) + 2;
				color = "has-text-success";
				break;
			case "casino":
				goldDifference = random.nextInt(101) - 50;
				color = "has-text-danger";
				break;
		}
		addGold(goldDifference);
		addLogs("<p class=\"" + color + "\">You entered a " + destination + " and earned " + goldDifference + " gold</p>");
	}
}
