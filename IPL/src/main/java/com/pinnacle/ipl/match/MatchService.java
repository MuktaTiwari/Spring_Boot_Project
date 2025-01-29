package com.pinnacle.ipl.match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.performance.Performance;
import com.pinnacle.ipl.team.Team;

@Service
public class MatchService {
	
	Team team1 = new Team(1, "Mumbai Indians","Mukesh Ambani and Nita Ambani");
	Team team2 = new Team(2, "Royal Challengers Bengaluru","Diageo");
	Team team3 = new Team(3, "Chennai Super Kings","N. Srinivasan");
	Team team4 = new Team(4, "Sunrisers Hyderabad"," Kalanithi Maran");
	Team team5 = new Team(5, "Kolkata Knight Riders"," Shah Rukh Khan");
	
	
	Match match1 = new Match(1,"20/09/2001","Shrilanka",team1,team2,Match.TEAM1_WIN);
	Match match2 = new Match(2,"40/2/2005","Nagpur",team3,team2,Match.TEAM2_WIN);
	Match match3 = new Match(3,"20/09/2001","Shrilanka",team4,team1,Match.MATCH_DRAW);
	Match match4 = new Match(4,"20/09/2001","Shrilanka",team3,team4,Match.TEAM2_WIN);
	Match match5 = new Match(5,"20/09/2001","Shrilanka",team2,team5,Match.TEAM1_WIN);
	
	
	private List<Match> match = new ArrayList<>(Arrays.asList(match1,match2,match3,match4,match5));

	public List<Match> getAllMatches(){
		return match;
	} 
	
	public void addMatch(Match mat) {
		
		match.add(mat);
	}


}
