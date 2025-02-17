package Week3.Day1;

public class CheckCommonNumberFromTwoArrays {

public static void main(String[] args) {
		
		int[] num1 = {1,2,6,9,3,7,8};
		int[] num2 = {2,6,4,8,7,5,11,17,19};
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(num1[i]==num2[j]) {
					System.out.println(num2[j]);
					break;
				}
			}
		}
		
	}	
}
