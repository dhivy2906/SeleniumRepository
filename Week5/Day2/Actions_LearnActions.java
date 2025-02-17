package Week5.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_LearnActions {

   @Test
	public  void runActionTC() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions action = new Actions(driver);
		driver.get("https://myntra.com");
		
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		action.moveToElement(men).click(driver.findElement(By.xpath("//a[text()='Blazers & Coats']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Cancellation']")).click();
		
		action.pause(2000).scrollByAmount(0, 500).perform();

		
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement draggableElement = driver.findElement(By.id("form:conpnl"));
		
		action.dragAndDropBy(draggableElement, 150, 0).pause(2000).dragAndDropBy(draggableElement, 100,0).build().perform();
		
		action.clickAndHold(draggableElement).pause(2000).moveByOffset(500, 0).release(draggableElement).perform();
		
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).pause(2000).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		//keyDown defines pressing key , keyUp defines - releasing key
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		action.sendKeys(searchElement, "TestLeaf").pause(2000).keyDown(Keys.LEFT_SHIFT)
		.keyDown(Keys.HOME).keyUp(Keys.HOME).keyUp(Keys.LEFT_SHIFT).perform();
	}
}
