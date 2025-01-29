package com.pinnacle.ipl.player;

import com.pinnacle.ipl.role.Role;

public class Player {
	
	private int playerID;
	private String playerName;
	private String Nationality;
	private  Role role;
	public Player(int playerID, String playerName, String nationality, Role role) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.Nationality = nationality;
		this.role = role;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	

}

