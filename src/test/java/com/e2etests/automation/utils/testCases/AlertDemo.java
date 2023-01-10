package com.e2etests.automation.utils.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open url / app my store
		driver.get("https://demoqa.com/alerts");

		//maximize browser
		driver.manage().window().maximize();
		
		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();
		
		
		//Accept alert  //chaufeur: switchTo / transfort de windew 
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println("the title of the app is : "+title);
		driver.quit();
	}

}
