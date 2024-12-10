package week1.day2;

public class Mini {
//global or class variable
	String brandName = "Mini";
	String modelName;
	String carColor;
	int noOfWheels = 4;
	int noOfMirrors = 2;
	int noOfDoors = 4;

	public void startCar() {
		System.out.println("Start the car");
	}
	public void driveCar() {
		System.out.println("Drive the car");
	}
	public void applyBreak() {
		System.out.println("Apply the break");
	}
	public void increaseSpeed() {
		System.out.println("Increase the Speed");
	}
	public void changeGear() {
		System.out.println("Change the Gear");
	}
	public void cooperS() {
		System.out.println("Brand Name is "+brandName);
		System.out.println("Model Name is "+modelName);
		System.out.println("Color of the car "+carColor);
		System.out.println("No. of wheels "+noOfWheels);
		System.out.println("No. of mirrors "+noOfMirrors);
		System.out.println("No. of doors "+noOfDoors);
		startCar();
	}
	public void countryMan() {
		System.out.println("Brand Name is "+brandName);
		System.out.println("Model Name is "+modelName);
		System.out.println("Color of the car "+carColor);
		System.out.println("No. of wheels "+noOfWheels);
		System.out.println("No. of mirrors "+noOfMirrors);
		System.out.println("No. of doors "+noOfDoors);
		driveCar();
	}
	
	public static void main (String[] args) {
		
		boolean isWorking = true; // local variable
		System.out.println("is working "+isWorking);
		Mini person1 = new Mini();
		Mini person2 = new Mini();
		Mini person3 = new Mini();
		
		System.out.println("------------------person1-----------------------");
		
		person1.modelName = "CooperS";
		person1.carColor = "Green";
		person1.cooperS();
		
		System.out.println("------------------person2-----------------------");
		
		person2.modelName = "countryMan";
		person2.carColor = "Blue";
		person2.countryMan();
		
		System.out.println("------------------person3-----------------------");
		
		person3.modelName = "CooperS";
		person3.carColor = "Yellow";
		person3.cooperS();
		
	}
}
