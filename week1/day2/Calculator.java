package week1.day2;

public class Calculator {

	//action in calculator is add, sub, multiple & division
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public float sub(int a, float b) {
		float c= a-b;
		return c;
	}
	
	public String multiple(float a, int b, float c) {
		float d = a*b*c;
		String output = "The multiple result is "+d;
		return output;
	}
	
	public float division(int a, float b) {
		return a/b;
	}
	
	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		
		calc.add(4, 3);
		System.out.println("The add result is "+calc.add(4, 9));

		float subResult = 	calc.sub(10, 3.3f);
		System.out.println("The sub result is "+subResult);
		
		String multiple = calc.multiple(3.4f, 4, 8.2f);
		System.out.println(multiple);
		
		float division	= calc.division(4, 6.3f);	
		System.out.println("The division result is "+division);
		
	}
}
