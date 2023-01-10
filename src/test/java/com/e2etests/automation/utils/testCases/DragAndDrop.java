package com.e2etests.automation.utils.testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open url / app my store
		driver.get("https://demoqa.com/droppable/");

		//maximize browser
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).perform();
		
		//verify test changed dropped 
		
		String textTareget = target.getText();
		if(textTareget.equals("Dropped!")) {
			System.out.println("pass : source is dropped to target as expacted");
		}else {
			System.out.println("fail : source is not dropped to target as expacted");
		}
		
		//Assert.assertEquals("Dropped!", textTareget);
		
		driver.quit();
		
		
		

	}

}
