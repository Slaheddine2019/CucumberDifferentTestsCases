package com.e2etests.automation.utils.draft;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");

		Thread.sleep(3000);
		
		// fill passWord
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.cssSelector(".oxd-main-menu-item.active")).click();
		driver.findElement(By.xpath("//button/i[contains(text(),'Add')]")).click();
		
		
		/*@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span]")
		public static WebElement btnAdmin;
		
		@FindBy(how = How.XPATH, using = "//button[@type='button']")
		public static WebElement btnAdd;*/
	}

}
