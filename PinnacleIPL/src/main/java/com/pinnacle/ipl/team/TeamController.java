package com.pinnacle.ipl.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TeamController {
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping(value = "/team")
	public List<Team> getAllTeams(){
		
		return teamService.getAllTeams();
	}
	
	@RequestMapping(value = "/team/{teamID}", method = RequestMethod.GET)
	public void getTeam(@PathVariable int teamID) {
		teamService.getTeam(teamID);
	}
	
	@RequestMapping(value="/team", method = RequestMethod.POST)
	public void addUser(@RequestBody Team team) {
		teamService.addTeam(team);
	}
	
	@RequestMapping(value = "/team/{teamID}", method = RequestMethod.DELETE)
	public void removeUser(@PathVariable int teamID) {
		teamService.deleteTeam(teamID);
	}
	
	@RequestMapping(value="/team/{teamID}", method = RequestMethod.PUT)
	public void getUser(@PathVariable int teamID, @RequestBody Team team) {

		teamService.updateTeam(teamID, team);

	}
	
	
	



}
