package Week3.day2;

public class Edge extends Browser{

	public Edge(float browserVersion) {
		super("Edge",browserVersion);
		// TODO Auto-generated constructor stub
	}
	public void takeSnap() {
		System.out.println("Edge is taking snapshot");
	}
	public void clearCookies() {
		System.out.println("Edge is clearing cookies");
	
	}
	
}
