package Week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\.cache\\selenium\\chromedriver\\win64\\131.0.6778.108\\chromedriver.exe");
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		// load the application url
		driver.get("https://www.google.com");
		//Java wait - input as milliseconds -> 1000milliseconds = 1second
		Thread.sleep(2000);
		//close the browser window
//		driver.close(); 
		
	}
	

}
