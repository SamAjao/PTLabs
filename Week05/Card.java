 /* Author : Samuel Ajao
 * Subject: Java Week 05 Lab - Object Oriented Programming
 * Program : Promineo Tech
 * Date   : May 21, 2024
 * 
 */
// Student: Samuel Ajao
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

package Week05;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	
	public Card() {
		
	}
	
	public Card(String name, String suit, String value) {
		
		setName(name);
		setSuit(suit);
		setValue(value);
		
	}
	
	public void describe() {
		System.out.print("Card name: " + name + "\tCard suite: " + suit +"\tCard value: " + value + "\n");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(String value) {
		switch(value) {
			case("Two"):
				this.value = 2;
				break;
			case("Three"):
				this.value = 3;
				break;
			case("Four"):
				this.value = 4;
				break;
			case("Five"):
				this.value = 5;
				break;
			case("Six"):
				this.value = 6;
				break;
			case("Seven"):
				this.value = 7;
				break;
			case("Eight"):
				this.value = 8;
				break;
			case("Nine"):
				this.value = 9;
				break;
			case("Ten"):
				this.value = 10;
				break;
			case("Jack"):
				this.value = 11;
				break;
			case("Queen"):
				this.value = 12;
				break;
			case("King"):
				this.value = 13;
				break;
			case("Ace"):
				this.value = 14;
				break;
			default:
				this.value = 0;
		}
	}

} // End of Card Class
