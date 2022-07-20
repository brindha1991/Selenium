package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Brindha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Senthil");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7459380856");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Poi@12345");
		WebElement Day = driver.findElement(By.xpath("(//select[contains(@id,'day')]"));
		Select drop1=new Select(Day);
		drop1.selectByIndex(9);
		WebElement Month = driver.findElement(By.xpath("(//select[contains(@id,'month')]"));
		Select drop2=new Select(Month);
		drop2.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("(//select[contains(@id,'year')]"));
		Select drop3=new Select(year);
		drop3.selectByIndex(32);
		driver.findElement(By.xpath("//label[text()='Female')]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
		
		
		
		
		

	}

}
