package Week3.Day1;

public class PrintNumbersFromRange 
{
	
	public void checkNumberIsOddOrEven(int startRange, int endRange) {
		//iterate the loop
		for(int i = startRange; i<=endRange; i++) {
			if(i%2==0){
				System.out.println("The number "+i+" is Even");
			}else {
				System.out.println("The number "+i+" is Odd");
			}
		}
		System.out.println("-------------------------------------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		PrintNumbersFromRange checkNumber = new PrintNumbersFromRange();
		checkNumber.checkNumberIsOddOrEven(10, 20);
		checkNumber.checkNumberIsOddOrEven(50, 75);
	}
}
