//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
// Student: Samuel Ajao
//
package Week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		System.out.println("Concatonate String List");
		System.out.println(concatString(myStringList));
		System.out.println(myStringList);

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println("Output String List with String object appended.");
		System.out.println(addString(myStringList, "Mike"));
		System.out.println(myStringList);

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> myIntList = new ArrayList<>();
		myIntList.add(1);
		myIntList.add(2);
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(5);
		myIntList.add(6);
		myIntList.add(7);
		myIntList.add(8);
		myIntList.add(9);
		myIntList.add(10);
		System.out.println("Print a list of sorted integer lists:");
		System.out.println(compileIntLists(myIntList));
		System.out.println("Original Int List: ");
		System.out.println(myIntList);
		
	
		

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.print("list of integers that contains the length of each string: ");
		System.out.print(getStringLengths(myStringList));
		System.out.println(myStringList);
		


		
		// 9. Create a set of strings and add 5 values
		Set<String> strSet = new HashSet<>();
		strSet.add("California");
		strSet.add("Nevada");
		strSet.add("Arizona");
		strSet.add("Oregon");
		strSet.add("Washington");
		System.out.println("Create a set of strings and add 5 values:");
		System.out.println(strSet);

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println("Add Colorado to Set.");
		strSet.add("Colorado");
		System.out.println("String in Set starts with...");
		System.out.println("A: " + getStartsWithChar(strSet, 'A'));
		System.out.println("W: " + getStartsWithChar(strSet, 'W'));
		System.out.println("C: " + getStartsWithChar(strSet, 'C'));
		System.out.println(strSet);
		


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println("Write and test a method that takes a set of strings and returns a list of the same strings");
		System.out.println(passSetReturnList(strSet));
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> myIntSet = new HashSet<>();
		myIntSet.add(1);
		myIntSet.add(2);
		myIntSet.add(3);
		myIntSet.add(4);
		myIntSet.add(5);
		myIntSet.add(6);
		myIntSet.add(7);
		myIntSet.add(8);
		myIntSet.add(9);
		myIntSet.add(10);
		System.out.println("Return a even set from a set of integers.");
		System.out.println(myIntSet);
		System.out.println(getEvenSet(myIntSet));


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String,String> wordDef = new HashMap<String, String>();
		wordDef.put("Fortify", "To strengthen and secure (a position) with fortifications.");
		wordDef.put("No", "A negative response; a denial or refusal:");
		wordDef.put("Touchscreen", "A monitor screen that can detect and respond to something, such as a finger or stylus, pressing on it.");
		wordDef.put("Backlist", "To place (a title) on a backlist.");
		wordDef.put("Taeniasis", "Infestation with tapeworms.");
		wordDef.put("Confocal", "Having the same focus or foci. Used of a lens.");
		wordDef.put("Complaisance", "The inclination to comply willingly with the wishes of others; amiability.");
		

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("returns the value for a key in the map that matches the string parameter (i.e. like a language dictionary lookup)");
		System.out.println(getDef(wordDef,"Backlist"));
		System.out.println(getDef(wordDef,"Taeniasis"));
		System.out.println(getDef(wordDef,"Apple"));
		System.out.println(wordDef);

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println("15. returns a Map<Character, Integer> containing a count of all the strings that start with a given character");
		System.out.println(myStringList);
		System.out.println(getStrLengths(myStringList));
		

	}
	
	//------------------------------------------METHODS BEGIN-------------------------------------------------------------------------------
	
	// Method 15:
	// 15. Write and test a method that takes a List<String> 
	//			and returns a Map<Character, Integer> containing a count of 
	//			all the strings that start with a given character
	public static Map<Character, Integer> getStrLengths(List<String> strList){
		
		Map<Character, Integer> charMap = new HashMap<>();
		List<String> listCpy = new ArrayList<String>(strList);
		char c;
		
		for(String s : listCpy) {
			c = s.charAt(0);
			
			if(charMap.containsKey(c)) {
				//increment count Value by 1
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				//Insert new key-value in Map.
				charMap.put(c, 1);
			}
	
		}
		
		return charMap;
		
	}
	
	
	
	// Method 14:
	// 14. Write and test a method that takes a Map<String, String> and a string 
	// 			and returns the value for a key in the map that matches the
	// 			string parameter (i.e. like a language dictionary lookup)
	public static String getDef(Map<String,String> myMap, String strKey) {
		
		StringBuilder wordDef = new StringBuilder();
		Map<String, String> mapCpy = new HashMap<>(myMap);
		
		for(Map.Entry<String, String> mp : mapCpy.entrySet()) {
			if(mp.getKey() == strKey) {
				wordDef.append(mapCpy.get(strKey));
			}
			
		}
		
		return wordDef.toString();
	}
	

	
	// Method 12:
	// 12. Write and test a method that takes a set of integers 
	//			and returns a new set of integers containing only even numbers 
	//			from the original set
	public static Set<Integer> getEvenSet(Set<Integer> iSet){
		
		Set<Integer> intSetCpy = new HashSet<Integer>(iSet);
		Set<Integer> evenSet = new HashSet<>();
		
		for(int i : intSetCpy) {
			if(i%2 == 0) {
				evenSet.add(i);
			}
		}
		
		return evenSet;
	}

	
	// Method 11:
	// 11. Write and test a method that takes a set of strings 
	//			and returns a list of the same strings
	public static List<String> passSetReturnList(Set<String> mySet){
		
		Set<String> cpyStrSet = new HashSet<String>(mySet);
		List<String> aList = new ArrayList<String>(cpyStrSet);
		//aList.addAll(cpyStrSet);
		
		System.out.println("Size of List copied from Set is: " + aList.size());
		
		return aList;
		
	}
	


	// Method 10:
	// 10. Write and test a method that takes a set of strings and a character 
	//			and returns a set of strings consisting of all the strings in the
	// 			input set that start with the character parameter.
	public static Set<String> getStartsWithChar(Set<String> aStringSet, char c){
		
		Set<String> cpyStrSet = new HashSet<String>(aStringSet);
		Set<String> startsWithSet = new HashSet<String>();
		
		for(String s : cpyStrSet) {
			if(s.charAt(0) == c) {
				startsWithSet.add(s);
			}
		}
		
		return startsWithSet;
	}
	
	

	
	// Method 8:
	// 8. Write and test a method that takes a list of strings 
	//			and returns a list of integers that contains the length of each string
	public static List<Integer> getStringLengths(List<String> aStringList){
		
		List<String> cpyStrList = new ArrayList<String>(aStringList);
		List<Integer> strLengths = new ArrayList<Integer>();
		
		for(String s : cpyStrList) {
			strLengths.add(s.length());
		}
		
		
		return strLengths;
	}
	

	
	// Method 7:
	// 7. Write and test a method that takes a list of integers 
	//			and returns a List<List<Integer>> with the following conditions specified
	//			for the return value:
	//	a. The first List in the returned value contains any number from the input list 
	//			that is divisible by 2
	//	b. The second List contains values from the input list that are divisible by 3
	//	c. The third containing values divisible by 5, and 
	//	d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	
	public static List<List<Integer>> compileIntLists(List<Integer> listOfInts){
		List<Integer> cpyIntList = new ArrayList<Integer>(listOfInts);
		List<List<Integer>> bigList = new ArrayList<List<Integer>>();
		int lastIndex = cpyIntList.size() - 1;
		
		List<Integer> div2List = new ArrayList<Integer>(); //	a. The first List in the returned value contains any number from the input list that is divisible by 2
		List<Integer> div3List = new ArrayList<Integer>(); //	b. The second List contains values from the input list that are divisible by 3
		List<Integer> div5List = new ArrayList<Integer>(); //	c. The third containing values divisible by 5, and 
		List<Integer> nonDivList = new ArrayList<Integer>(); //	d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		for(int i = 0; i <= lastIndex; i++) {
			if(cpyIntList.get(i)%2 == 0) {
				div2List.add(cpyIntList.get(i));
			}
			if(cpyIntList.get(i)%3 == 0) {
				div3List.add(cpyIntList.get(i));
			}
			if(cpyIntList.get(i)%5 == 0) {
				div5List.add(cpyIntList.get(i));
			}
			if(cpyIntList.get(i)%2 != 0 && cpyIntList.get(i)%3 != 0 && cpyIntList.get(i)%5 != 0) {
				nonDivList.add(cpyIntList.get(i));
			}
		}
		
		bigList.add(div2List);
		bigList.add(div3List);
		bigList.add(div5List);
		bigList.add(nonDivList);
		
		
		return bigList;
	}
	

	
	// Method 6:
	// 6. Write and test a method that takes a list of strings and a string 
	//			and returns a new list with all strings from the original list
	// 			containing the second string parameter (i.e. like a search method)
	
	public static List<String> addString(List<String> sList, String s){
		
		List<String> cpyList = new ArrayList<String>(sList);
		StringBuilder inString = new StringBuilder(s);
		
		cpyList.add(inString.toString());
		
		return cpyList;
	}

	
	// Method 5:
	// 5. Write and test a method that takes a list of strings 
	//			and returns a string with all the list elements concatenated to each other,
	//
	public static String concatString(List<String> myList){
		
		int lastIndex = myList.size() - 1;
		List<String> sList = new ArrayList<String>(myList);
		StringBuilder concatString = new StringBuilder();
		
		if(lastIndex < 0) {
			System.out.println("List is empty.");
		}
		else {
			for(int i = 0; i<=lastIndex; i++) {
				concatString.append(sList.get(i));
			}
		}
		
		
		return concatString.toString();
	}
	
	
	
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