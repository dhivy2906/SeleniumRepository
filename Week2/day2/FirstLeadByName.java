package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLeadByName {

		public static void main(String[] args) throws InterruptedException {
			 // Launch the browser
	        ChromeDriver driver = new ChromeDriver();
	        // maximize the browser
	        driver.manage().window().maximize();
	        // load the application url
	        driver.get("http://leaftaps.com/opentaps/");
	        // locate the username field
	        WebElement usernameField = driver.findElement(By.id("username"));
	        // enter the input as demosalesmanager for usernameField
	        usernameField.sendKeys("demosalesmanager");
	        // locate the password field and enter the password as crmsfa
	        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	        //locate the login button and click
	        driver.findElement(By.className("decorativeSubmit")).click();
	        //to get the title of the webpage -> getTitle() and returnType as string
	        String title = driver.getTitle();
	        System.out.println("Title is "+title);
	        //locate the CRM/SFA link and click
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        System.out.println(driver.getTitle());
	    
	        // locate the Leads tab and click
			driver.findElement(By.linkText("Leads")).click();
			//locate the find lead link and click
			driver.findElement(By.linkText("Find Leads")).click();
			// locate the first name field and enter the name as Gokul
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Babu");
			//locate the find leads button and click
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			//locate the first lead id and click
			WebElement firstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			firstLeadId.click();
	        
	        
		}
	}


