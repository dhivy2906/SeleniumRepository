package Week3.day2;

public class BrowserTest {

	public static void main(String[] args) {
		Chrome chrome = new Chrome(112.3f);
		
		chrome.openURL("www.google.com");
		chrome.openIncongnito();
		chrome.clearCache();
		
		System.out.println("-----------------------------------");
		Edge edge = new Edge(116.0f);
		edge.openURL("www.microsoft.com");
		edge.takeSnap();
		edge.clearCookies();
	}
}
