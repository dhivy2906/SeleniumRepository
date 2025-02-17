package Week5.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://leafground.com/table.xhtml");
		 driver.manage().window().maximize();
		 List<WebElement> tableHeaders = driver.findElements(By.xpath("(//table)[6]/thead/tr/th"));
		 for (WebElement webElement : tableHeaders) {
			System.out.println(webElement.getText());
		}
		 System.out.println("---------------------------------");
		 int rowCount = driver.findElements(By.xpath("(//table)[6]/tbody/tr")).size();
		 int colCount = driver.findElements(By.xpath("(//table)[6]/thead/tr/th")).size();
		 for(int i=1; i<=rowCount; i++) {
			 for(int j=1; j<=colCount; j++) {
		 System.out.println(driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td["+j+"]")).getText());
			 }
		 }
	}
	
}
