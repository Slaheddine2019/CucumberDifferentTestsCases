package com.e2etests.automation.utils.draft;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Before
	void setup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	}
	@Test
	void test() {
		driver.findElement(By.xpath("//input[ng-model='first']")).sendKeys("10");
		driver.findElement(By.xpath("//input[ng-model='second']")).sendKeys("20");
		WebElement op = driver.findElement(By.xpath("//select=@ng-model='operator']"));
		op.click();
		Select s = new Select(op);
		s.selectByIndex(2);
		driver.findElement(By.id("gobutton")).click();
		String result = driver.findElement(By.tagName("h2")).getText();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Pattern pattern = Pattern.compile("//d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println(result);
	}
	@After
	void tearDown () {
		//driver.quit();
	}

}
