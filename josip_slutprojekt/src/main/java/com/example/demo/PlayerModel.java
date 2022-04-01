package com.example.demo;

import java.util.Random;

public class PlayerModel {
	
	private String move;
	private int score;
	
	
	
	public String getMove() {
		return move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	
	
	public void setScore() {
		this.score +=1;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setComputerMove() {
		
			Random rn = new Random();
			int answer = rn.nextInt(3);
			String returnVal = "";
			
			switch (answer) {
				case 0:
					returnVal = "rock";
					break;
				
				case 1:
					returnVal = "scissors";
					break;
					
				case 2:
					returnVal = "paper";
					break;
		
				default:
					break;
			}
			
			this.move = returnVal;
			
			
		
	}

}
