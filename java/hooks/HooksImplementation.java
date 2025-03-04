package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinition.Base;

public class HooksImplementation extends Base{

	@Before
	public void preCondition() {
		driver = new ChromeDriver(); // if declared as local throw nullPointerException
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@After
	public void postCondition() {
		driver.quit();
		}
	
}