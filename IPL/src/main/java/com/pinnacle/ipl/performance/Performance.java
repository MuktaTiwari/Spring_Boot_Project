package com.pinnacle.ipl.performance;

import com.pinnacle.ipl.match.Match;
import com.pinnacle.ipl.player.Player;

public class Performance {
	
	private int performanceID;
	private int runs;
	private int balls;
	private int wickets;
	private int overs;
	private Player playerId;
	private Match matchId;
	public Performance(int performanceID, int runs, int balls, int wickets, int overs, Player playerId,
			Match matchId) {
		super();
		this.performanceID = performanceID;
		this.runs = runs;
		this.balls = balls;
		this.wickets = wickets;
		this.overs = overs;
		this.playerId = playerId;
		this.matchId = matchId;
	}
	public int getPerformanceID() {
		return performanceID;
	}
	public void setPerformanceID(int performanceID) {
		this.performanceID = performanceID;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public Player getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Player playerId) {
		this.playerId = playerId;
	}
	public Match getMatchId() {
		return matchId;
	}
	public void setMatchId(Match matchId) {
		this.matchId = matchId;
	}
	
	
	
	
	

}
