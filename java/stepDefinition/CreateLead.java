package stepDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Base{
//	ChromeDriver driver;
	
	@When("click on the crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("click on the leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("click on the create lead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("enter the company name as {string}")
	public void enterCompany(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("enter the first name as {string}")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("enter the last name as {string}")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@Given("enter the phno as {string}")
	public void enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	
	@When("click on the submit button")
	public void clickSubmitBtn() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("verify the leadId")
	public void verifyLeadId() {
		String companyNameAndLeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyNameAndLeadId);
	}
	

}