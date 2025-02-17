package Week3.Day1;

import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println(x);
		x =1;
		// Array Literal --> datatype[] variableName = {value with comma separation};
		long phoneNumbers[] = {8925411174l,8925411175l,8925411176l, 8925411177l, 8925411178l, 8925411179l,8925411180l,8925411179l};
		int length = phoneNumbers.length;
		System.out.println(length);
		phoneNumbers[0] = 9876543210L;
		for(int i=0; i<length; i++) {
			System.out.println(phoneNumbers[i]);
		}
		System.out.println("------------------------------");
		//Array instantiation --> datatype[] variableName = new datatype[size];
		int[] numbers = new int[7];
		int length2 = numbers.length;
		System.out.println("Length of numbers is "+length2);
		numbers[0] = 7;
		numbers[1] = 6;
		numbers[2] = 2;
		numbers[3] = 4;
		numbers[4] = 1;
		numbers[5] = 5;
		numbers[6] = 3;
		System.out.println(numbers[5]);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//to sort Arrays
		Arrays.sort(numbers);
		System.out.println("<--------After sort-------->");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
}
