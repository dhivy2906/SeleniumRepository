package Week6.Day1.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{

	@Test(dataProvider = "sendData")
	public void runCreateLead(String cname, String fname, String lname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider
	public String[][] sendData() {
		String[][] data = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Gokul";
		data[0][2] = "Sekar";
		
		data[1][0] = "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "M";
		
		return data;
	}
}






