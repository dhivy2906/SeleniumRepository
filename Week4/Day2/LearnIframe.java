package Week4.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIframe {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/frame.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().frame(0);
	
	
	WebElement element = driver.findElement(By.id("Click"));
	element.click();
	System.out.println(element.getText());
	
	driver.switchTo().defaultContent();// help to comeback to main page or out from the frame
	
	WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
	searchField.sendKeys("Testleaf");
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println("Count of the frame is "+ frames.size());

	WebElement parentFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
	driver.switchTo().frame(parentFrame);// parent frame 
	
	driver.switchTo().frame("frame2"); // child frame
	driver.findElement(By.id("Click")).click();
	
	driver.switchTo().parentFrame(); // (OR) driver.switchTo().defaultContent(); will be used
	
	String domAttribute = driver.findElement(By.tagName("iframe")).getDomAttribute("src");
	System.out.println(domAttribute);
	
	driver.switchTo().parentFrame();
	String domAttribute2 = driver.findElement(By.tagName("iframe")).getDomAttribute("src");
	System.out.println(domAttribute2);
	
}
}
