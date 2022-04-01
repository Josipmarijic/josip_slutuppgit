package com.example.demo;

public class CalcService {
	
	public String kalkylator(String n1, String n2, String operator) {
		int siffra1 = 0;
		int siffra2 = 0;
		int result = 0;
		try {
			siffra1 = Integer.parseInt(n1);
			siffra2 = Integer.parseInt(n2);
		} catch (Exception e) {
			return "fel ange en giltig siffra";
		}
		
		switch (operator) {
		case "plus":
			result = siffra1 + siffra2;
			return "svaret är: " + result;
		case "minus":
			result = siffra1 - siffra2;
			return "svaret är: " + result;
		case "multiplikation":
			result = siffra1 * siffra2;
			return "svaret är: " + result;
		default:
			String pattern = "{\"answer\": \"%s\"";
			return String.format(pattern, result);
			
		}
		
	}
	
	public String kalkylatorDescription() {
		return "[GET] Endpoint /kalkylator/n1=x&n2=y&plus" + "/r/n" + 
	           ">Quary parameter n1 [String]"+ "/r/n" +
			   ">Quary parameter n2 [String]" + "/r/n" +
               "<Returns json ==> {result:answer}";
	}




}
