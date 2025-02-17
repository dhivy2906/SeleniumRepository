package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createLead {
	public static void main(String[] args) {
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
       
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
       

     //locate the source dropdown element
     // step1: locate the dropdown element
     WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
     // step2: Create object for Select class and pass the WebElement reference into the argument
     Select sourceDD = new Select(sourceEle);
     // step3: using method to select index from the dropdown
     sourceDD.selectByIndex(4);

     //locate the marketing campaign and select by visible text automobile
     WebElement marketingEle = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     Select marketingDD = new Select(marketingEle);
     marketingDD.selectByVisibleText("Automobile");

     //locate the ownership dropdown and select corperation
     WebElement ownershipid = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
     Select ownership = new Select(ownershipid);
     ownership.selectByValue("OWN_CCORP");


     //locate the create lead button and click
     // driver.findElement(By.className("smallSubmit")).click();
     driver.findElement(By.name("submitButton")).click();

     System.out.println(driver.getTitle());
     //locate the leadId and retrive the text
     String companyNameAndLeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
     System.out.println(companyNameAndLeadId);

     }
}
