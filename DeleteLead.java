package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']")).sendKeys("+447459380858");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//a[text()='13928']")).click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("13928");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				String title1 = driver.getTitle();
				System.out.println(title1);

	}

}
