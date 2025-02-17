package Week3.Day1;

public class LearnString {

public static void main(String[] args) {
		
		String name1 = "Test leaf";
		String name2 = "Test leaf";
		System.out.println(name1==name2);
		String name3 = new String("Test leaf");
		String name4 = new String("test leaf");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name1==name3);
		System.out.println(name4==name3);
		
		int length = name1.length();
		System.out.println(length);
		System.out.println(name1.equals(name4));
		System.out.println(name1.equalsIgnoreCase(name4));
		System.out.println(name4.contains("Test"));
		char charAt = name1.charAt(5);
		System.out.println(charAt);
		String[] split = name1.split("e");
		System.out.println(split[1]);
		String upperCase = name1.toUpperCase();
		String lowerCase = name1.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(upperCase);
	}
}
