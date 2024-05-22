/*
 * Author : Samuel Ajao
 * Subject: Java Week 05 Lab - Object Oriented Programming
 * Program : Promineo Tech
 * Date   : May 21, 2024
 * 
 */
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
		//"Clubs", "Diamonds", "Hearts", "Spades"
package Week05;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private String deckName;
	private List<String> suits = new ArrayList<String>();
	private List<String> values = new ArrayList<String>();
	
	public Deck(String name) {
		
		//Deck Name
		setDeckName(name);
		
		cards = new ArrayList<Card>(buildDeck());
		
		
	}
	
	
	public void describe() {
		System.out.println("Cards in the Deck:");
		for(Card c : cards) {
			c.describe();
		}
	}
	
	
	public List<Card> buildDeck(){
		
		List<Card> deck = new ArrayList<Card>();
		
		//Suites
		suits.add("Clubs");
		suits.add("Diamonds");
		suits.add("Hearts");
		suits.add("Spades");
		
		//Values
		values.add("Two");
		values.add("Three");
		values.add("Four");
		values.add("Five");
		values.add("Six");
		values.add("Seven");
		values.add("Eight");
		values.add("Nine");
		values.add("Jack");
		values.add("Queen");
		values.add("King");
		values.add("Ace");
		
		//Nested for-loops to iterate through every value of every suit, create a card, add card to deck and then return deck.
		for(String s : suits) {
			for(String v : values) {
				String n = v + " of " + s;  
				Card c = new Card(n, s, v);
				deck.add(c);
			}
		}
		
		return deck;
		
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}

}
