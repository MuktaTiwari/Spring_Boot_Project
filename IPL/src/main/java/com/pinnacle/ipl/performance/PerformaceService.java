package com.pinnacle.ipl.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.match.Match;
import com.pinnacle.ipl.player.Player;
import com.pinnacle.ipl.role.Role;
import com.pinnacle.ipl.team.Team;

@Service
public class PerformaceService {
	
	private Player player1 = new Player(1,"Aman","INDIAN", Role.BATSMAN);
	private Player player2 = new Player(2,"Kishor","INDIAN", Role.BOWLER);
	private Player player3 = new Player(3,"Raj","INDIAN", Role.ALLROUNDER);
	
	Team team1 = new Team(1, "Mumbai Indians","Mukesh Ambani and Nita Ambani");
	Team team2 = new Team(2, "Royal Challengers Bengaluru","Diageo");
	Team team3 = new Team(3, "Chennai Super Kings","N. Srinivasan");
	 
	Match match1 = new Match(1,"20/09/2001","Shrilanka",team1,team2,Match.TEAM1_WIN);
	Match match2 = new Match(2,"40/2/2005","Nagpur",team3,team2,Match.TEAM2_WIN);
	Match match3 = new Match(1,"20/09/2001","Shrilanka",team2,team1,Match.MATCH_DRAW);
	
	Performance per1 = new Performance(1,290,23,4,20,player1,match1);
	Performance per2 = new Performance(2,223,34,3,20,player2,match2);
	Performance per3 = new Performance(3,123,24,7,20,player3,match3);
	
	private List<Performance> performance = new ArrayList<>(Arrays.asList(per1,per2,per3));
	
	public List<Performance> getAllPerformace(){
		return performance;
	}
	
	
	public Performance getPerformanceById(int performanceID) {
		Performance per = performance.stream()
				.filter(p -> performanceID == p.getPerformanceID())
				.findFirst()
				.orElse(null);
		
		return per;
		
	}
	
	public void addPerformance(Performance per) {
		
		performance.add(per);
		
	}


	public void deletePerformance(int performanceID) {
		performance.removeIf(r -> r.getPerformanceID() == performanceID);
	}


	public void updatePerformace(int performanceID, Performance per) 
	{
		 for(int i = 0; i < performance.size(); i++) {
				
			 Performance p = performance.get(i);
			
				if(p.getPerformanceID() == performanceID) {
			
					performance.set(i, per);
			
				     return;
				}
	}
	}
	
}
