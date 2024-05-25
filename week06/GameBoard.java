/*
 * Author : Samuel Ajao
 * Subject: Java Week 06 Lab - Tic-Tac-Toe
 * Program : Promineo Tech
 * Date   : May 23, 2024
 * 
 */
package week06;

import java.util.ArrayList;
import java.util.Arrays;
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
	private Set<Integer> openSpaces = new HashSet<>();
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
	
	public boolean isSpaceAvailable(int sel) {
		//returns true if space has not yet been removed (selected)
		return openSpaces.contains(sel);
	}
	
	public void removeSpaceFromAvailable(int sel) {
		this.openSpaces.remove(sel);
	}
	
	public int whatTurn() {
		return gameTurn;
	}
	
	private void setBoard() {
		
		for(int i =1;i<10;i++) {
			this.spaces.add(i);
			this.openSpaces.add(i);
		}
		
		this.gameTurn = 1;
	}
	
	
	private boolean checkThreeInARow(Map<String, List<Integer>> filledSpaces) {
		
		boolean crossFound = false;
		
		/*  Cross combinations required to win
		 * 	 1-2-3, 4-5-6, 7-8-9
		 *   1-4-7, 2-5-8, 3-6-9
		 *   1-5-9, 3-5-7
		 */
		Set<Integer> path1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> path2 = new HashSet<>(Arrays.asList(4,5,6));
		Set<Integer> path3 = new HashSet<>(Arrays.asList(7,8,9));
		Set<Integer> path4 = new HashSet<>(Arrays.asList(1,4,7));
		Set<Integer> path5 = new HashSet<>(Arrays.asList(2,5,8));
		Set<Integer> path6 = new HashSet<>(Arrays.asList(3,6,9));
		Set<Integer> path7 = new HashSet<>(Arrays.asList(1,5,9));
		Set<Integer> path8 = new HashSet<>(Arrays.asList(3,5,7));
		
		for(Map.Entry<String,List<Integer>> entry : filledSpaces.entrySet()) {
			if(entry.getValue().contains(path1) || entry.getValue().contains(path2) || entry.getValue().contains(path3)
					|| entry.getValue().contains(path4) || entry.getValue().contains(path5) || entry.getValue().contains(path6)
					|| entry.getValue().contains(path7) || entry.getValue().contains(path8)) {
				crossFound = true;
			}
			else {
				crossFound = false;
			}
			
		}
		
		
		return crossFound;
	}

}
