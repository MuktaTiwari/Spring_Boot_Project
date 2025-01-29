package com.pinnacle.ipl.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pinnacle.ipl.team.Team;



@RestController
public class MatchController {
	
	
	@Autowired
	MatchService matchService;
	
	@RequestMapping(value = "/match")
	public List<Match> getAllPost(){
		
		return matchService.getAllMatches();
		
	}
	
	@RequestMapping(value="/match", method = RequestMethod.POST)
	public void addMatch(@RequestBody Match mat) {
		matchService.addMatch(mat);
	}

}
