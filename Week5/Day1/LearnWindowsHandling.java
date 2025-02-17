package Week5.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsHandling {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone",Keys.ENTER);
		System.out.println("Title of the page before click "+ driver.getTitle());
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")).click();
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[3]")).click();
		
		//Get the present window id or address or handle
		String currentWindowId = driver.getWindowHandle();
		System.out.println("Current window Id is "+ currentWindowId);
		//Get all the opened window or tab id/add.../handles
		
		Set<String> windowHandles = driver.getWindowHandles();// implementation class is LinkedHashSet so the order will be maintained
		List<String> windowNames = new ArrayList<String>(windowHandles);
		System.out.println(windowNames.get(0));
		System.out.println(windowNames.get(1));
		System.out.println("<------------------------>");
		for (String string : windowNames) {
			System.out.println(string);
		}
		System.out.println("<------------------------>");
		driver.switchTo().window(windowNames.get(3));
		System.out.println("Title of the page after click "+ driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}
}
