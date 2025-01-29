package com.pinnacle.ipl.match;

import com.pinnacle.ipl.team.Team;

public class Match {
	
	public static final String TEAM1_WIN = "Team 1 : WIN";
    public static final String TEAM2_WIN = "Team 2 : WIN";
    public static final String MATCH_DRAW = "MATCH DRAW";
	
	private int matchId;
	private String date;
	private String venue;
	private Team team1;
	private Team team2;
	private String result;
	
	public Match(int matchId, String date, String venue, Team team1, Team team2,String result) {
		super();
		this.matchId = matchId;
		this.date = date;
		this.venue = venue;
		this.team1 = team1;
		this.team2 = team2;
		this.result = result;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	

}
