package Week4.Day1;

public class MethodOverloading {

	public void reportStep(String msg,String status) {
		System.out.println("The message is "+msg);
		System.out.println("The status is "+status);
		}
	public void reportStep(String msg,String status, boolean snap) {
		System.out.println("The message is "+msg);
		System.out.println("The status is "+status);
		System.out.println("Screenshot status "+snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading report = new MethodOverloading();
		report.reportStep("Received","sent");
		report.reportStep("Not received","Failed",false);

	}

}
