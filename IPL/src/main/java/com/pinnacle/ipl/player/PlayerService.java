package com.pinnacle.ipl.player;

import com.pinnacle.ipl.player.Player;
import com.pinnacle.ipl.role.Role;
import com.pinnacle.ipl.team.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	private Player player1 = new Player(1,"Aman","INDIAN", Role.BATSMAN);
	private Player player2 = new Player(2,"Kishor","INDIAN", Role.BOWLER);
	private Player player3 = new Player(3,"Raj","INDIAN", Role.ALLROUNDER);
	private Player player4 = new Player(4,"Neha","INDIAN", Role.BOWLER);
	private Player player5 = new Player(5,"Khushi","INDIAN", Role.BATSMAN);
	private Player player6 = new Player(6,"Pooja","INDIAN", Role.BOWLER);
	private Player player7 = new Player(7,"Simaran","INDIAN", Role.ALLROUNDER);

	private List<Player> players = new ArrayList<>(Arrays.asList(player1,player2,player3,player4,player5,player6,player7));
 
	
	public List<Player> getAllPlayers() {
		return players;
	}
	
	public Player getPlayerById(int playerID) {
		Player player = players.stream()
				.filter(t -> playerID==(t.getPlayerID()))
				.findFirst()
				.orElse(null);
		return player;

	}
	
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void deleteplayer(int playerID) {
		players.removeIf(r -> r.getPlayerID() == playerID);
		
	}
	
	public void updatePlayer(int playerID, Player player) {
		
		for(int i = 0; i<=players.size(); i++) {
			Player p = players.get(i);
			if(p.getPlayerID() == playerID) {
				players.set(i, player);
				return;
			
			}
			
		}
	}
}


