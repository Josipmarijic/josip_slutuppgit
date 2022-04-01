package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController  {
	
	
private CalcService kalkylator = new CalcService();
	
	@CrossOrigin
	@RequestMapping("/calcDescription")
	public String root() {
		return kalkylator.kalkylatorDescription();
	}
	
	@CrossOrigin
	@RequestMapping("/calc")
	public String kalkylator(String n1, String n2, String operator) {
		
		return kalkylator.kalkylator(n1, n2, operator);
	}
	
	

	

}
