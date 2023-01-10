package com.e2etests.automation.utils.testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	public WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void valide_UserCredential() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type'submit']")).click();
	}
	@Test
	public void inValide_UserCredential() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("rahma");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("rahma123");
		driver.findElement(By.xpath("//button[@type'submit']")).click();
	}
	@AfterClass
	public static void tearDown() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

}
