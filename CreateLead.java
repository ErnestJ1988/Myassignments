package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ernest");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jebaraj");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		String PageTittle = driver.getTitle();
		
		System.out.println("The page tittle is " + PageTittle );
		if (PageTittle.contains("Lead | opentaps CRM")) {
			System.out.println("The page tittle is displayed correctly");
			
			
			
		} else {
			System.out.println("The page tittle is not displayed correctly");

		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
