 package com.e2etests.automation.utils.draft;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperCalculator {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://juliemr.github.io/protractor-demo/");
		driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(10)));

		//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@Test
	public void robotTest() throws InterruptedException {

		
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("20");
		driver.findElement(By.id("gobutton")).click();
		WebElement result = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println("The result is : " +result.getText());
		
		//String result = driver.findElement(By.cssSelector("ng-binding")).getText();
		//System.out.println("la valeur est =" + result);
	
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
