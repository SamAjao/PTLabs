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
	private List<String> spaces = new ArrayList<>();
	private Set<Integer> openSpaces = new HashSet<>();
	private Map<String,List<Integer>> claimedSpaces = new HashMap<>();
	
	public GameBoard(){
		this.player1 = "Player 1";
		this.player2 = "Player 2";
		setBoard();
		
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
		
		String playerToken;
		if(gameTurn %2 != 0) {
			playerToken = "X";
		}
		else {
			playerToken = "O";
		}
		
		//combine player's selection lists
		this.claimedSpaces.get(player).add(selection);
		
		
		//update player selections
		this.spaces.set(selection-1, playerToken);
		
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
	
	public int getTurn() {
		return gameTurn;
	}
	
	
	public void displayBoard() {

		//print data on each row of board
		for(int i = 0; i<9; i+=3) {
			printAsterisks(19);
			System.out.println();
			printRow(i,i+2);
			System.out.println();
			
		}
		
		printAsterisks(19);
		System.out.println();
		
	}
	
	
	public boolean checkGameOver(String p){
		//returns true if three in a row found
		//return checkThreeInARow(claimedSpaces);
		/*  Cross combinations required to win
		 * 	 1-2-3, 4-5-6, 7-8-9
		 *   1-4-7, 2-5-8, 3-6-9
		 *   1-5-9, 3-5-7
		 */
		
		boolean crossFound;
		
		Set<Integer> path1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> path2 = new HashSet<>(Arrays.asList(4,5,6));
		Set<Integer> path3 = new HashSet<>(Arrays.asList(7,8,9));
		Set<Integer> path4 = new HashSet<>(Arrays.asList(1,4,7));
		Set<Integer> path5 = new HashSet<>(Arrays.asList(2,5,8));
		Set<Integer> path6 = new HashSet<>(Arrays.asList(3,6,9));
		Set<Integer> path7 = new HashSet<>(Arrays.asList(1,5,9));
		Set<Integer> path8 = new HashSet<>(Arrays.asList(3,5,7));
		
		List<Integer> list = new ArrayList<Integer>(claimedSpaces.get(p));
		if(list.containsAll(path1) || list.containsAll(path2) || list.containsAll(path3)
				|| list.containsAll(path4) || list.containsAll(path5) || list.containsAll(path6)
				|| list.containsAll(path7) || list.containsAll(path8)) {
			crossFound = true;
		}
		else {
			crossFound = false;
		}
		
		return crossFound;
		
	}
	
	private void printAsterisks(int printAste) {
		
		for(int i = 0; i < printAste; i++) {
			System.out.print("*");
		}

	}
	
	private void printRow(int start, int finish) {
		for(int i = start; i <= finish; i++) {
		System.out.print("|  " + spaces.get(i)+"  ");
		}
		System.out.print("|");
	}
	
	private void setBoard() {
		
		List<Integer> initList1 = new ArrayList<Integer>();
		List<Integer> initList2 = new ArrayList<Integer>();
		
		for(int i =1;i<10;i++) {
			this.spaces.add(String.valueOf(i));
			this.openSpaces.add(i);
		}
		
		//initialize player lists
		this.claimedSpaces.put(player1, initList1);
		this.claimedSpaces.put(player2, initList2);
		
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
			if(entry.getValue().containsAll(path1) || entry.getValue().containsAll(path2) || entry.getValue().containsAll(path3)
					|| entry.getValue().containsAll(path4) || entry.getValue().containsAll(path5) || entry.getValue().containsAll(path6)
					|| entry.getValue().containsAll(path7) || entry.getValue().containsAll(path8)) {
				crossFound = true;
			}
			else {
				crossFound = false;
			}
			
		}
		
		
		return crossFound;
	}

}
