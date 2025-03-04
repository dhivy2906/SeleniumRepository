package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Base extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver; // static keyword helps to make the property as single memory
	
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver(); // if declared as local throw nullPointerException
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
		}
	
	
	
}