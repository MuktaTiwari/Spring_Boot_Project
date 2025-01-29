package com.pinnacle.ipl.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(value = "/player")
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}
	
	@RequestMapping(value = "/player/{playerID}")
	public Player getPlayerById(@PathVariable int playerID) {
		return playerService.getPlayerById(playerID);
	}
	
	@RequestMapping(value = "/player", method = RequestMethod.POST)
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}
	
	@RequestMapping(value = "/player/{playerID}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable int playerID) {
		playerService.deleteplayer(playerID);
		
	}
	
	@RequestMapping(value = "/player{playerID}", method = RequestMethod.PUT)
	public void updatePlayer(@PathVariable int playerID, @RequestBody Player player ) {
		playerService.updatePlayer(playerID, player);
	}

}
