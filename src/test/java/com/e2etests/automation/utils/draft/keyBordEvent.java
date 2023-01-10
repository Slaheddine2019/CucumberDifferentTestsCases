package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyBordEvent {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		// Find web Element
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));


		JavascriptExecutor js = (JavascriptExecutor) driver;// pour controler wondow
		js.executeScript("window.scrollBy(0,250)");// scroll down in thepage
		Thread.sleep(3000);

		//Instantiate Actions class
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "Nesrine").perform();
		actions.sendKeys(userEmail, "weslati.nesrine96@gmail.com").perform();
		actions.sendKeys(currentAddress, "mourouj,Tunis").perform();





		//copy current addressn to per permanent adress
		actions.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c");
		actions.keyDown(permanentAddress, Keys.CONTROL).sendKeys("v").perform();


		//javascript executer click button submit
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",btnsubmit);
		//TODO sendkeys with java
		// driver.quit();


		}

		}


