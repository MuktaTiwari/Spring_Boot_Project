package com.pinnacle.ipl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value = "/")
	public static String welcomepage() {
		
		return "Welcome";
	}

}
