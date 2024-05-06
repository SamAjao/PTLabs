//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
// Student: Samuel Ajao
//
package Week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] intArray = {1,5,2,8,13,6};
		
		int arrayLength = intArray.length;
		System.out.println(arrayLength);

		
		// 2. Print out the first element in the array
		System.out.println(intArray[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(intArray[arrayLength-1]);


		
		
		// 4. Print out the element in the array at position 6, what happens?
		/*
		 * System.out.println(intArray[6]);
		 * 
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at Labs/Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:32)
		 */

		
		// 5. Print out the element in the array at position -1, what happens?
		/*
		 * System.out.println(intArray[-1]);
		 * 
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
	at Labs/Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:38)
		 */

			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Iterating through intArray");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Enhanced for loop:");
		for(int arrayNum : intArray) {
			System.out.println(arrayNum);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		System.out.println("Array sum:");
		for(int arrayNum: intArray) {
			sum += arrayNum;
			System.out.println(sum);
		}

			
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = sum/intArray.length;
		System.out.println("Average of array elements:");
		System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("Odd numbers.");
		for(int arrayElement : intArray) {
			if((arrayElement%2) != 0) {
				System.out.println(arrayElement);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] aGroup = {"Sam","Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for(String groupMember: aGroup) {
			sumOfLetters += groupMember.length();
		}
		System.out.println("There are " + sumOfLetters + " letters in the array.");
		
		
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		printGreeting("Sally");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String greeting = returnGreeting("Bob");
		System.out.println(greeting);

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("returns true if the number of letters in the string is greater than the int");
		System.out.println(returnStringSizeGreater("Fives", 4));
		System.out.println(returnStringSizeGreater("Fives", 5));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("returns true if the string passed in exists in the array");
		String[] myStringArray = {"Cat", "Dog", "Hamster","Turtle"};
		System.out.println(checkInArray(myStringArray, "Parrot"));
		System.out.println(checkInArray(myStringArray, "Hamster"));
		
		
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println("returns the smallest number in the array");
		System.out.println(smallestInteger(intArray));
		int[] intArray2 = intArray;
		intArray2[0] = 1000;
		System.out.println(smallestInteger(intArray2));
		
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.println("returns the average of double array");
		double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 6.0};
		System.out.println(averageDouble(doubleArray));
		
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.println("returns an array of int where each element matches the length of the string at that position");
		int[] intArray19 = stringLengths(aGroup);
		for(int iA : intArray19) {
			System.out.println(iA);
		}
		for(String sA : aGroup) {
			System.out.println(sA);
		}
		
						
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println("returns true if the sum of letters for all strings with an even amount of letters is greater than the sum of those with an odd amount of letters.");
		System.out.println(moreEvenLetters(aGroup));
		String[] bGroup = {"Dog", "Cat", "Hamster","Bike", "Kite"};
		System.out.println(moreEvenLetters(bGroup));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("Write and test a method that takes a string and returns true if the string is a palindrome");
		String palString = "rar";
		int s = 7;
		System.out.println(s/2);
		System.out.println(isPalindrome(palString));
		
		
		
		
		
		
	}
		
		

	

	
	// Method 13:
	public static void printGreeting(String aName){
		
		System.out.println("Hello, " + aName + "!");
		
	}


	// Method 14:
	public static String returnGreeting(String aName){
		String myGreeting = "Hello, " + aName + "!";
		
		return myGreeting;
	}

	
	// Method 15:
	public static boolean returnStringSizeGreater(String aString, int sizeComp) {
		return aString.length() > sizeComp;
	}

	
	// Method 16:
	public static boolean checkInArray(String[] stringArray, String testString) {
		boolean appears = false;
		
		for(String check : stringArray) {
			if(check == testString)
				appears = true;
		}
		
		return appears;

	}
			
		
	// Method 17:
	public static int smallestInteger(int[] intArray){
		int smallest = intArray[0];
		
		for(int i : intArray) {
			if(i < smallest) {
				smallest = i;
			}
		}
		
		return smallest;
	}

	
	// Method 18:
	public static double averageDouble(double[] doubleArray) {
		double average = 0.0;
		double sum = 0.0;
		
		for(double d : doubleArray) {
			sum += d;
		}
		
		average = (sum/doubleArray.length);
		
		
		return average;
	}

	
	// Method 19:
	public static int[] stringLengths(String[] sArray) {
		int[] intArray = new int[sArray.length];
		int i = 0;
		
		for(String s : sArray) {
			intArray[i] = s.length();
			i++;
		}
		
		return intArray;
	}

	
	// Method 20:
	// 20. Write and test a method that takes an array of strings and 
			//			returns true if the sum of letters for all strings with an even amount of letters
			//			is greater than the sum of those with an odd amount of letters.
	public static boolean moreEvenLetters(String[] sArray) {
		int sumEven = 0, sumOdd = 0;
		
		for(String s : sArray) {
			if((s.length() % 2) == 0) {
				sumEven += s.length();
			}
			else {
				sumOdd += s.length();
			}
		}
		
		return sumEven > sumOdd;
	}
	
	
	// Method 21:
	// 21. Write and test a method that takes a string and 
			//			returns true if the string is a palindrome
	public static boolean isPalindrome(String s) {
		boolean palindrome = true, isEven = false;
		
		int strLength = s.length();
		int halfStr = strLength/2;
		
		if(s.length()%2 == 0) {
			isEven = true;
		}
		
		for(int i = 0; i < halfStr; i++) {
			if( s.charAt(i) != s.charAt(strLength -1 -i)) {
				palindrome = false;
			}
		}
		
		return palindrome;
	}

}
