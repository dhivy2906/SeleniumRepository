package Week3.day2;

public class Browser {

		String browserName;
		float browserVersion;

public Browser(String browserName, float browserVersion) {
	this.browserName = browserName;
	this.browserVersion = browserVersion;
}
		
public void openURL(String url) {
	System.out.println(browserName + "is opening URL:" +url);
}
public void closeBrowser() {
	System.out.println(browserName + "is closing");
}
public void navigateBack() {
	System.out.println(browserName + "is navigating back.");
}
}
