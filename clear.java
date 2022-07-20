package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clear {

	public static void main(String[] args) {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Brindha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("senthil");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Account");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Find me");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("brindha.christ@gmail.com");
				WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select drop1=new Select(state);
				drop1.selectByValue("NY");
				String title=driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("Duplicate Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadvik");
				String title1=driver.getTitle();
				System.out.println(title1);
				
				
			}


	}

