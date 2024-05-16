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
		System.out.println("Card name: " + name);
		System.out.println("Card suite: " + suit);
		System.out.println("Card value: " + value);
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
			case("2"):
				this.value = 2;
				break;
			case("3"):
				this.value = 3;
				break;
			case("4"):
				this.value = 4;
				break;
			case("5"):
				this.value = 5;
				break;
			case("6"):
				this.value = 6;
				break;
			case("7"):
				this.value = 7;
				break;
			case("8"):
				this.value = 8;
				break;
			case("9"):
				this.value = 9;
				break;
			case("10"):
				this.value = 10;
				break;
			case("J"):
				this.value = 11;
				break;
			case("Q"):
				this.value = 12;
				break;
			case("K"):
				this.value = 13;
				break;
			case("A"):
				this.value = 14;
				break;
			default:
				this.value = 0;
		}
	}

} // End of Card Class
