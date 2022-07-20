package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//input")).sendKeys("brindha.christ@gmail.com");
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//input)[2]")).sendKeys("Append");
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("HP");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Apple");
		driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).sendKeys("No Value");
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
		
		

	}

}
