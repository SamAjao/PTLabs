//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
// Student: Samuel Ajao
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		int seatsRemaining = 50;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroc = 140.00;

		
		// 3. Create a variable to hold a person's middle initial
		char MdlI = 'C';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		String weather;
		boolean isHot = true;
		if (isHot)
			weather = "hot";
			else
				weather = "not hot";

		
		// 5. Create a variable to hold a customer's first name
		String fName = "Jack";

		
		// 6. Create a variable to hold a street address
		String streetAddr = "123 Main Street";
		

		// 7. Print all variables to the console
		System.out.println("Variables:");
		System.out.println("available plane seats left on a flight: " + seatsRemaining);
		System.out.println("cost of groceries at checkout: " + String.format("%.2f", costOfGroc));
		System.out.println("middle initial: " + MdlI);
		System.out.println("The weather is: " + weather);
		System.out.println("first name: " + fName);
		System.out.println("street address: " + streetAddr);
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		System.out.println("A customer booked 2 plane seats");
		seatsRemaining = seatsRemaining -2;
		System.out.println("available plane seats left on a flight: " + seatsRemaining);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		System.out.println("Impulse candy bar purchase, add 2.15 to the grocery total");
		costOfGroc = costOfGroc + 2.15;
		System.out.println("cost of groceries at checkout: " + String.format("%.2f", costOfGroc));


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		System.out.println("The birth certificate was printed incorrectly.");
		MdlI = 'D';
		System.out.println("updated middle initial: " + MdlI);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		System.out.println("The season has changed.");
		isHot = !isHot;
		if (isHot)
			weather = "hot";
			else
				weather = "not hot";
		System.out.println("The weather is: " + weather);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName, lName = "Johnson";
		fullName = fName + " " + MdlI + ". " + lName;
		System.out.println("full name: " + fullName);
		
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println(fullName + " lives at " + streetAddr);

		
		
	}
}
