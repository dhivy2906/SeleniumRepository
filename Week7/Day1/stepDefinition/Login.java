package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base{
//	ChromeDriver driver;
	
	@Given("setup the env")
	public void setupEnv() {
		driver = new ChromeDriver(); // if declared as local throw nullPointerException
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@Given("enter the username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");;
	}
	
	@But("enter the password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");;
	}
	
	@When("click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("verify the login is success")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
	}
	

}