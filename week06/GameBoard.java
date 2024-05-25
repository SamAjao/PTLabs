/*
 * Author : Samuel Ajao
 * Subject: Java Week 06 Lab - Tic-Tac-Toe
 * Program : Promineo Tech
 * Date   : May 23, 2024
 * 
 */
package week06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameBoard {
	
	private String player1;
	private String player2;
	private int gameTurn;
	private Set<Integer> spaces = new HashSet<>();
	private Map<String,List<Integer>> claimedSpaces = new HashMap<>();
	
	public GameBoard(){
		setBoard();
		this.player1 = "Player 1";
		this.player2 = "Player 2";
		
	}
	
	
	public GameBoard(String p1, String p2) {
		this.player1 = p1;
		this.player2 = p2;
		setBoard();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	
	public void playerSelection(String player, int selection) {
		
		List<Integer> space = new ArrayList<Integer>();
		space.add(selection);
		
		//combine player's selection lists
		space.addAll(claimedSpaces.get(player));
		
		//update player selections
		this.claimedSpaces.put(player, space);
		
		//next game turn
		this.gameTurn += 1;
	}
	
	
	public int whatTurn() {
		return gameTurn;
	}
	
	private void setBoard() {
		
		for(int i =1;i<10;i++) {
			this.spaces.add(i);
		}
		
		this.gameTurn = 1;
	}
	
	
	private boolean checkThreeInARow(Map<String, List<Integer>> filledSpaces) {
		
		boolean crossFound = false;
		
		/*if 1-2-3, 4-5-6, 7-8-9
		 *   1-4-7, 2-5-8, 3-6-9
		 *   1-5-9, 3-5-7
		 */
		
		
		return crossFound;
	}

}
