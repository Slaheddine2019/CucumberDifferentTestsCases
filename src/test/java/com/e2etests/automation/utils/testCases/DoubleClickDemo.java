package com.e2etests.automation.utils.testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open url / app my store
		driver.get("https://demoqa.com/buttons");

		//maximize browser
		driver.manage().window().maximize();
		
		//Instantiate Actions Class
		Actions actions = new Actions(driver);
		
		//retrieve web Element to perfore double click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		//double click on the button
		actions.doubleClick(btnDoubleClick).build().perform();
		
		String msg = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals("You have done a double click", msg);
		
		driver.quit();

	}

}
