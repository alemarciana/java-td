package com.alessandra.web.models;
import java.util.ArrayList;

public class Roster {
	private ArrayList<Team> teams = new ArrayList<Team>();
	public Roster() {}
	public void addTeam(Team team) {
		teams.add(team);
	}
	public void removeTeam(Team team) {
		teams.remove(team);
	}
	public ArrayList<Team> getTeams() {
		return teams;
	}
}
