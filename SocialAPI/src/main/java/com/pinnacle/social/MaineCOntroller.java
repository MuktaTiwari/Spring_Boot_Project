package com.pinnacle.social;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaineCOntroller {
	

	@RequestMapping(value= "/")
	public static String web() {
		
		return "Hello i'am controller";
	}

	

}
