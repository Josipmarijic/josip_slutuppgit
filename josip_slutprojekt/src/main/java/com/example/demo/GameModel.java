package com.example.demo;

public class GameModel {
	
	private PlayerModel playerOne = new PlayerModel();
	private PlayerModel computer = new PlayerModel();
	
	
	public void setPlayerMove(String playerMove) {
		
		this.playerOne.setMove(playerMove);
		
	}
	
	public void setComputerMove() {
		
		this.computer.setComputerMove();
	}
	
	public int getPlayerScore() {
		return this.playerOne.getScore();
	}
	
	public int getComputerScore() {
		return this.computer.getScore();
	}
	public String playGame() {
		
		String playerMove = this.playerOne.getMove();
		String computerMove = this.computer.getMove();
		String winner = "";
		
		switch (playerMove) {
		case "rock":
			
			switch (computerMove) {
			case "rock":
				winner = "tie";
				break;
				
				
			case "scissors":
				playerOne.setScore();
				winner ="player wins";
				break;
			
			case "paper":
				computer.setScore();
				winner ="computer wins";
				break;	
			
			}
			break;
			
		case "scissors":
			
			switch (computerMove) {
			case "rock":
				computer.setScore();
				winner = "computer wins";
				break;
			
			case "scissors":
				winner = "tie";
				break;
				
			case "paper":
				playerOne.setScore();
				winner = "player wins";
				break;
			}
			
			break;
		case "paper":
			
			switch (computerMove) {
			case "rock":
				playerOne.setScore();
				winner = "player wins";
				break;
				
			case "scissors":
				computer.setScore();
				winner = "computer wins";
				break;
				 
			case "paper":
				winner = "tie";
				break;
			}
			
			break;

			
		
		}
		
		return  winner;
		
	
	}

}
