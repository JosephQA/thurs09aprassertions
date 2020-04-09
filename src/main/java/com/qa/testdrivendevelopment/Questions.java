package com.qa.testdrivendevelopment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		char[] carray = input.toCharArray();
		char[] outarr = new char[carray.length * 3];
		for(int i = 0; i< carray.length;i++) {
			int j = 3*i;
			outarr[j] = carray[i];
			outarr[j+1] = carray[i];
			outarr[j+2] = carray[i];
		}
		String msg = String.copyValueOf(outarr);
		return msg;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
//		sandwich.replaceAll("+*bread", "");
//		sandwich.replaceAll("bread*+", "");#
		sandwich.toLowerCase();
		String[] sand = sandwich.split("bread");
//		System.out.println(sandwich);
		String gsm ="";
		String retstr;
		try {
			
		String msg = sand[1];
		char[] temp = msg.toCharArray();
		
		char[] which = new char[msg.length()];
		int k = 0;
	//	System.out.println("_____________________");
		//System.out.println(msg);
		//System.out.println(sand[1].length());
	//	System.out.println(which.length);
		//System.out.println("_____________________");
		for(int i=sand[1].length() ; i>0 ;i--) {
			
		//	System.out.println(i);
			//System.out.println(k);
			which[k] = temp[i-1];
			gsm = String.copyValueOf(which);
			k++;
			//System.out.println(which);
		}
		//System.out.println("here");
		//gsm = String.copyValueOf(which);
		retstr = gsm;
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			
		retstr = gsm;
		}
		return retstr;
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br> possible values
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		int[] arr = new int[3];
		boolean bool=false;
		arr[0] = a;
		arr[1]=b;
		arr[2]=c;
		Arrays.sort(arr);
		if(Math.abs(arr[0]-arr[1])==Math.abs(arr[1]-arr[2])) {bool = true;}
				
		return bool;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
    	return "";
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		String jast4 = input.substring(input.length()-4, input.length());
		//System.out.println(jast4);
				if (jast4.equalsIgnoreCase("java")) {;return true;}//System.out.println("true")
				else{ return false;
				}
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		char last = 0;
		int count = 1;
		int MAXCOUNT=0;
		char[] arr =input.toCharArray();
				for(int i=0;i<arr.length;i++) {
					if(arr[i] != last) { count = 1;}
					else { ++count; if(count>MAXCOUNT) {
						MAXCOUNT = count;}
				};
				last=arr[i];
			}
		
    	return MAXCOUNT;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
    	return -1;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		
	String msg = "";
		if(number%3==0) {msg += "fizz";}
		if(number%5==0) {msg+="buzz";}
		if(msg.contentEquals("")) {msg = null;}
    	return msg;
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		ArrayList<String> innies = new ArrayList<String>();
		int MAXSUM=0;
		int[] arr = new int[100]; 
				String[] strs = input.split("\\s");
		//		System.out.println(strs[0].toString());
		for(int i = 0; i< strs.length; i++ ) {
			innies.add(strs[i]);
			
		}
		//System.out.println(innies);
		int last = 0;
		
		// innies.forEach((ele)->{ //handling strings of 22....33....44 seperatelu
			for(int q = 0;q<innies.size();q++) {
			 char[] chars = innies.get(q).toCharArray();
			int sum=0;
			int current=0;
			
			for(int j = 0; j<chars.length;j++) {
				current = Integer.parseInt(String.valueOf(chars[j]));
				//System.out.println(current);
				sum = current + sum;
				if(sum>=MAXSUM) {MAXSUM = sum;}
				
				
			}
			
		}
			return MAXSUM;
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		boolean bool = false;
		if(index > word.length()) {bool = false;}
		else {
			char[] arr = word.toCharArray();
			char str = arr[index-1]; 
			bool = (str == letter);
		}
		
    	return bool;
	}
}
