//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab
// Student: Samuel Ajao
//
package Week05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week005OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card twoOfHearts = new Card("twoOfHearts", "Hearts", "Two");
		
		
		// Call the describe method on the newly instantiated card.
		twoOfHearts.describe();
		
		
		
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck
		Deck deck = new Deck("Deck 1");
		System.out.println("Number of remaining cards in deck: " + deck.getDeckSize());
	    
	    
	    // Call the describe method on the newly instantiated deck.
		deck.describe();
	    
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		deck.shuffleDeck();
		
		
		// Call the describe method on the newly shuffled deck.
		deck.describe();

		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here
		System.out.println("Number of remaining cards in deck: " + deck.getDeckSize());
		Card drawCard = new Card();
		drawCard = deck.draw();
		
		System.out.print("Drawn Card::: ");
		drawCard.describe();
		
		System.out.println("Number of remaining cards in deck: " + deck.getDeckSize());
		deck.describe();
		
				
		
		
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		
		Map<String, List<Card>> game1 = new HashMap<String,List<Card>>();
		
		int numPlayers = 5;
		game1 = createGameBoard(numPlayers);
		
		for (Map.Entry<String, List<Card>> entry : game1.entrySet()) {
			System.out.println("\n" + entry.getKey());
		    for(Card c : entry.getValue()) {
		    	c.describe();
		    }
		}
		
		
	} //End of Main 
	
	// Method 5:
	public static Map<String, List<Card>> createGameBoard(int numPlayers) {
		
		//Create the game board
		Map<String, List<Card>> gameMap = new HashMap<String,List<Card>>();
		
		//Build a deck
		Deck gameDeck = new Deck("Game Deck");
		
		//Shuffle the deck
		gameDeck.shuffleDeck();
		
		System.out.println("The number of cards in the deck is " + gameDeck.getDeckSize());
		
		//Divide the cards evenly among players
		int cardsPerPlayer = gameDeck.getDeckSize()/numPlayers;
		System.out.println("Each player receives " + cardsPerPlayer + " cards");
		
		
		for(int i = 1; i <= numPlayers; i++) {
			//Instantiate values going into Map for each individual player
			StringBuilder playerName = new StringBuilder();
			playerName.append("Player " + (i));
			List<Card> playerHand = new ArrayList<Card>();
			
			
			for(int j = 1; j <= cardsPerPlayer; j++) {
				playerHand.add(gameDeck.draw());
			}
			
			gameMap.put(playerName.toString(), playerHand);
			
			
		}
		
		
		System.out.println("The number of cards in the deck is " + gameDeck.getDeckSize());
		
		return gameMap;
		
	} //End of createGameBoard Method
	
	
	
	

} //End of Class