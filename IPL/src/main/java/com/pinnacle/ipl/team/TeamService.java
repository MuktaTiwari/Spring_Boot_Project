package com.pinnacle.ipl.team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;




@Service
public class TeamService {
	
	Team team1 = new Team(1, "Mumbai Indians","Mukesh Ambani and Nita Ambani");
	Team team2 = new Team(2, "Royal Challengers Bengaluru","Diageo");
	Team team3 = new Team(3, "Chennai Super Kings","N. Srinivasan");
	Team team4 = new Team(4, "Sunrisers Hyderabad"," Kalanithi Maran");
	Team team5 = new Team(5, "Kolkata Knight Riders"," Shah Rukh Khan");
	
	private List<Team> Teams = new ArrayList<>(Arrays.asList(team1,team2,team3,team4,team5));
	
	public List<Team> getAllTeams(){
		return Teams;
	}
	
	
	public Team getTeam(int teamID) {
	    Team team = Teams.stream()
			.filter(t -> t.getTeamID()==teamID)
			.findFirst()
			.orElse(null);
			
	    return team;
	}
	
	public void addTeam(Team team) {
		Teams.add(team);
	}
	
	public void deleteTeam(int id) {
		Teams.removeIf(u -> u.getTeamID()==id);
		
	}
	

	
	public void updateTeam(int teamID, Team team) 
	{
	
	    for(int i = 0; i < Teams.size(); i++) {
	
	    Team t = Teams.get(i);
	
		if(t.getTeamID()==teamID) {
	
			Teams.set(i, team);
	
		     return;
		}
	}
	
	
	
	

	}
}
