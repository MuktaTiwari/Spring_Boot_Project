package com.pinnacle.ipl.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PerformanceController {
	
	@Autowired
	PerformaceService performanceService;
	

	
	@RequestMapping(value = "/per")
	public List<Performance> getAllPerformace(){
		
		return performanceService.getAllPerformace();
	}
	
	@RequestMapping(value = "/per/{performanceID}")
	public Performance getPerformanceById(@PathVariable int performanceID) {
		
		return performanceService.getPerformanceById(performanceID);
	}
	
	
	@RequestMapping(value = "/per", method = RequestMethod.POST)
	public void addPerformance(@RequestBody Performance per) {
		
		performanceService.addPerformance(per);
		
	}
	
	
	@RequestMapping(value = "/per/{performanceID}", method = RequestMethod.DELETE)
	public void deletePerformance(@PathVariable int performanceID) {
		
		performanceService.deletePerformance(performanceID);
	}
	
	@RequestMapping(value = "/per/{performanceID}", method = RequestMethod.PUT)
	
	public void updatePerformace(@PathVariable int performanceID, @RequestBody Performance per) {
		performanceService.updatePerformace(performanceID,per);
	}
	
}
