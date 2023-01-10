package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo {
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeTest
	public void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test
	 public void robotTest () {
		 WebElement element = driver.findElement(By.cssSelector("#rightClickBtn"));
		 Actions action = new Actions (driver);
		 action.contextClick(element).perform();
		 String mg = driver.findElement(By.id("rightClickMessage")).getText();
		 System.out.println("successfully");
		 
		 
	 }
	 @AfterTest
	 public void tearDown() {
		 //driver.quit();
	 }

}
