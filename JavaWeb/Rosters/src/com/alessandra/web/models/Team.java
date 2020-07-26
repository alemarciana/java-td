package com.alessandra.web.models;
import java.util.ArrayList; 

public class Team {
	String teamName;
	ArrayList<Player> players = new ArrayList<Player>();
	public Team() {}
	public Team(String teamName) {
		this.teamName = teamName;
	}
	public void addPlayer(Player player) {
		players.add(player);
	}
	public void removePlayer(Player player) {
		players.remove(player);
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public int getNumOfPlayers() {
		return players.size();
	}
	public void setTeamName(String name) {
		this.teamName = name;
	}
	public String getTeamName() {
		return teamName;
	}
}
