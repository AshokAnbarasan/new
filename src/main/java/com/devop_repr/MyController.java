package com.devop_repr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value="/getmsg")
	public String getmsg() {
		return "this is ashok.thi is my test project for devops";
	}

}
