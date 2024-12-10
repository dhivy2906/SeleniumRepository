package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
		public static boolean isPrime( int number) {
			
			if (number<2) {
				return false;
			}
			
			for(int i=2; i<=Math.sqrt(number);i++){
			if(number%i ==0) {
				return false;
			}
		
		}
		
		return true;
	
}

	}