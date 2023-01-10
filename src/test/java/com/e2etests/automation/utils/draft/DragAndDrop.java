package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DragAndDrop {
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url ="https://demoqa.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void robotTest() {
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions (driver);
		action.dragAndDrop(drag, drop).perform();
		String textDrop = drop.getText();
		Assert.assertEquals("Dropped!", textDrop);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
