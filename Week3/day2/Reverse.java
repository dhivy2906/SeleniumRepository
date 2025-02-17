package Week3.day2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Test Leaf";
		
		char[] character = input.toCharArray();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(character[i]);
			
			
		}
	}

}
