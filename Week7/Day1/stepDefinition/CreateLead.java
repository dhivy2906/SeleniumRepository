package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead extends Base{
//	ChromeDriver driver;
	
	@When("click on the crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("click on the leads tab")
	public void clickLeadsTab() {
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("click on the create lead link")
	public void clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("enter the company name")
	public void companyName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	
	@And ("enter the first name")
	public void firstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
	}
	
	@And ("enter the last name")
	public void lastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
	}
	
	@When ("click on the submit button")
	public void submit() {
	driver.findElement(By.name("submitButton")).click();
	}
}