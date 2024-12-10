package week1.day2;

public class CheckNumberIsOddOrEven {

	public void checkNumber(int a) {
		if(a%2==0){
			System.out.println("The number "+a+" is Even");
		}else {
			System.out.println("The number "+a+" is Odd");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumberIsOddOrEven check = new CheckNumberIsOddOrEven();
		check.checkNumber(10);
		check.checkNumber(3);
		check.checkNumber(6);
		check.checkNumber(8);
		check.checkNumber(9);
		check.checkNumber(37);
		
		
	}

}
