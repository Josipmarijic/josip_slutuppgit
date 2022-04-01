package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
	
	@RequestMapping(
			value = "/",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_HTML_VALUE
		)
	public String myForm() {
		String htmlForm = "<html><body><h1>rock paper or scissors<h1><form action=\"http://localhost:8080/spela\"  method=\"POST\">Your move: <input type=\"text\" name=\"playerOneMove\"><input type=\"submit\" value=\"spela\"></form></body></html>";

		return htmlForm;
	}
	
	
	
	@RequestMapping(value="/spela", method= RequestMethod.POST)
	@RestController
	public class spelController {
		
		private GameModel newGame = new GameModel();
		
		@RequestMapping
		public String playGame(String playerOneMove) {
			newGame.setPlayerMove(playerOneMove);
			newGame.setComputerMove();
		
			
			String result = newGame.playGame();
			
			
			return result;
		}
		
		@RequestMapping(
				method = RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE, 
				path="/json")
		
		public String totalScore(){
			return ObjectJson();
		}
		
		private String ObjectJson() {
			return "{\"playerscore\":" + newGame.getPlayerScore() + "," + "\"computerscore\":" + newGame.getComputerScore() +  "}";
		}
	}

}
