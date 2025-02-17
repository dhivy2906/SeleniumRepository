package Week3.day2;

public class ReverseString {

	//String input = "Hello World!"
		//String expectedOutput = "!dlroW olleH"
		
		
		public static void main(String[] args) {
			
			String input = "Hello World!";
			String expectedOutput = "!dlroW olleH";
			String output = "";
			//System.out.println(input.charAt(input.length()-1));
			//System.out.println(input.charAt(input.length()-2));
			//System.out.println("<-------------------->");
			// convert the String into char[]
			char[] eachChar = input.toCharArray();
			for(int i= eachChar.length-1 ; i>=0; i--){
//				System.out.print(eachChar[i]);
				output = output+eachChar[i];
				
			}
			System.out.println(output);
			if(expectedOutput.equals(output)) {
				System.out.println("The expected output is verified");
			}else {
				System.out.println("The expected output is not verified");
			}
			
		}
		
		
}
