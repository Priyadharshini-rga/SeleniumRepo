package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
		
		driver.findElement(By.name("generalProfTitle")).sendKeys("LeadsPage");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println("Title of the page is "+Title);
		driver.close();
		
		
	}

}
