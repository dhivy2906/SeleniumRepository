package Week4.Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following::span[text()='Show']")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
				
		System.out.println(alert.getText());
		alert.accept();
		
		//tagname[text()='text of the element']/following::tagName[text()='text of the element']
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span[text()='Show']")).click();
		
		System.out.println(alert.getText());
		alert.dismiss();
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Dhivya");
		alert.accept();
		
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span[text()='Show']")).click();
		String text = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']")).getText();
		System.out.println(text);
		driver.findElement(By.name("j_idt88:j_idt98")).click();
		
		
		String text2 = driver.findElement(By.className("card")).getText();
		System.out.println(text2);
	}
}
