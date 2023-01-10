package com.e2etests.automation.utils.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open url / app my store
		driver.get("https://demoqa.com/menu/");

		//maximize browser
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		Actions actions = new Actions (driver); 
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		
		actions.moveToElement(mouseHover).perform();
		
		driver.quit();

	}

}
