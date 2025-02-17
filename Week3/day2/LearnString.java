package Week3.day2;

import java.util.Arrays;

public class LearnString {

	public static void main(String[] args) {

		String input = "Welcome to Testleaf";
		int length = input.length();// length() helps to get length of the string
		boolean equals = input.equals("Welcome to Testleaf");// equals() helps to compare the String with exact case
		boolean equalsIgnoreCase = input.equalsIgnoreCase("welcome TO TestLeaf");// equalsIgnoreCase() helps to compare
																					// the String and ignore case
																					// sensitive
		boolean contains = input.contains("Testleaf");// contains() helps to validate/check partial string with case
														// sensitive
		System.out.println("The length of the String is " + length);
		System.out.println("Is equals " + equals);
		System.out.println("Is equals ignore case " + equalsIgnoreCase);
		System.out.println("Is contains " + contains);
		char charAt = input.charAt(18);
		System.out.println(charAt);
		String[] split = input.split("e");
		System.out.println(split[4]);
		String lowerCase = input.toLowerCase();
		String upperCase = input.toUpperCase();
		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(input);
		String concat = input.concat(" , we are in week3 day1");
		System.out.println(concat);
		System.out.println(input);
		String replace = input.replace("e", "");
		System.out.println(replace);
		
		char[] charArrays = input.toCharArray();
		//System.out.println("char[] --> "+charArray);
		String string = Arrays.toString(charArrays);
		System.out.println(string);
	}
}
