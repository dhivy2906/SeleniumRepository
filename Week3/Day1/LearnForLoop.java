package Week3.Day1;

public class LearnForLoop {

public static void main(String[] args) {
		
		// for loop syntax:
//			for(initialization; condition; increment or decrement){}
		for (int i =1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------------------");
		//print from 10 to 1
		for(int x =10; x>0; x--) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		int a = 1;
		int b = 1;
		a = a +2;
		System.out.println(a++); // a = a + 1; // post condition - it wil use the variable and update the value
		System.out.println(++b); // b = b + 1; // pre condition - it will update the value first and then use the variable
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b++);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println(--a);
		System.out.println(b--);
		System.out.println(b);
		
	}

	
	}
