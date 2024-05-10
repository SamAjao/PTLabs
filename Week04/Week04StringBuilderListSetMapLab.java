//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
// Student: Samuel Ajao
//
package Week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder SBuild = new StringBuilder();
		//SBuild.append("0-1-2-3-4-5-6-7-8-9");
		//SBuild.append(0);
		for(int i = 0; i <=9; i++) {
			SBuild.append(i);
			if(i < 9) {
				SBuild.append("-");
			}
		}
		System.out.println(SBuild);

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List <String> myStringList = new ArrayList<String>(); //Reads as (with diamond operator): "A List of Strings called 'myStringList'"
		myStringList.add("Kate");
		myStringList.add("Tammy");
		myStringList.add("Loren");
		myStringList.add("Bruce");
		myStringList.add("Bob");

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		String shortString = findShortestString(myStringList);
		System.out.println("The shortest String is: " +shortString);

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		List<String> flippedList = new ArrayList<>(myStringList);
		//flippedList = myStringList;
		
		flippedList = flipFirstLastString(flippedList);//Assigns new value to list.
		System.out.println("FLIPPED LIST:");
		System.out.println(myStringList);
		System.out.println(flippedList);
		System.out.println("FLIP BACK");
		System.out.println(flipFirstLastString(flippedList));//Prints, but...
		System.out.println(flippedList);//does not assign updated value of flip to list.

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string


		
		// 9. Create a set of strings and add 5 values

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}
	
	
	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	

	
	// Method 7:
	

	
	// Method 6:
	

	
	// Method 5:
	
	
	
	// Method 4:
	// 4. Write and test a method that takes a list of strings 
	//			and returns the list with the first and last element switched
	public static List<String> flipFirstLastString(List<String> myList){
		
		int lastIndex = myList.size() - 1;
		List<String> flippedList = new ArrayList<String>(myList);
		StringBuilder firstString = new StringBuilder();
		
		
		if(lastIndex < 0) {
			System.out.println("List is empty.");
		}
		else {
			
			//flippedList = myList;
			firstString = new StringBuilder(flippedList.get(0));
			flippedList.set(0, flippedList.get(lastIndex));
			flippedList.set(lastIndex, firstString.toString());
			
			
		}
		
		return flippedList;
		
	}
	
	
	
	// Method 3:
	// Write and test a method that takes a list of strings 
	//			and returns the shortest string
	public static String findShortestString(List<String> myList) {
		
		StringBuilder shortestString = new StringBuilder();
		shortestString.append(myList.get(0)); //Get the first item in the list
		int stringLength = shortestString.length(); //Get length of first string element in list 
		
		for(String s : myList) {
			if(s.length() < stringLength) {
				shortestString = new StringBuilder(s);
			}
		}
		
		return shortestString.toString();
		
	}
	
	

}