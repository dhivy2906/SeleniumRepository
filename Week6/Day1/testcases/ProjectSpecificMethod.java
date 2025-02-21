package Week6.Day1.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	RemoteWebDriver driver;
	
	@Parameters({"url", "uname", "pwd", "browserName"})// reading value from the xml file based on the key (which is name attribute value)
	@BeforeMethod
	public void preCondition(String url, String username, String pwd, String browser) {
		System.out.println("url: "+url );
		System.out.println("username: "+username );
		System.out.println("password: "+pwd );
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
	
	
}