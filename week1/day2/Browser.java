package week1.day2;

public class Browser {
	
	    float browserVersion = 4.0f;
	   
	    void launchBrowser() {
	        System.out.println("Browser launched successfully.");
	    }

	    void loadUrl() {
	        System.out.println("URL loaded successfully.");
	    }
		    public static void main(String[] args) {
	       
	        Browser chrome = new Browser();
	        Browser edge = new Browser();
	            
	        System.out.println("Chrome Browser:");
	        chrome.launchBrowser();
	        chrome.loadUrl();
	        System.out.println("Chrome version: " + chrome.browserVersion);
	   
	        System.out.println("------------------------------");
	        System.out.println("Edge Browser:");
	        edge.launchBrowser();
	        edge.loadUrl();
	        edge.browserVersion = 8.0f;
	        System.out.println("Edge version: " + edge.browserVersion);
	    }

}

