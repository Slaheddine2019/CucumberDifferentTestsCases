package com.e2etests.automation.utils.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		//TODO sendkeys with java
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('userName').value='Oueslati';");
		
		// Find web Element
		//WebElement userName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		
		//Instantiate Actions class
		Actions actions = new Actions(driver);
		//actions.sendKeys(userName, "Nesrine").perform();
		actions.sendKeys(userEmail, "weslati.nesrine96@gmail.com").perform();
		actions.sendKeys(currentAddress, "mourouj,Tunis").perform();
		

		
		//scroll down in thepage
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		
		//copy current addressn to per permanent adress
		actions.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c");
		actions.keyDown(permanentAddress, Keys.CONTROL).sendKeys("v").perform();
		
	
		
		//javascript executer click button submit
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",btnsubmit);
		
		driver.quit();

	}

}
