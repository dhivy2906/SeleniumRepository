package Week3.day2;

public class VehicleGP {

	public void applyBreak() {
		System.out.println("Apply the break");
	}
	
	public void soundHorn() {
		System.out.println("Press the Horn");
	}
	
	public static void main(String[] args) {
		
		VehicleGP gp = new VehicleGP();
		gp.applyBreak();
		gp.soundHorn();
		
		
	}
}
