package week1.day2;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's positive or negative: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negative number.");
        }

        scanner.close();
	}

}
