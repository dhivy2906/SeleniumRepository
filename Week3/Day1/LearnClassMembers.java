package Week3.Day1;

public class LearnClassMembers {

int x =0;
	
	public void increaseXvariable() {
		x++;// x = x+1;
	}
	
	public static void main(String[] args) {
		LearnClassMembers lcm = new LearnClassMembers();
		System.out.println(lcm.x);
		lcm.increaseXvariable();
		lcm.increaseXvariable();
		lcm.increaseXvariable();
		lcm.increaseXvariable();
		lcm.increaseXvariable();
		System.out.println(lcm.x);
	}
}
