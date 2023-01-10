package com.e2etests.automation.utils.draft;

import java.time.Duration;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSiteDemoblaze {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://www.demoblaze.com/";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("login2")).click();

		JavascriptExecutor jsName = (JavascriptExecutor) driver;
		jsName.executeScript("document.getElementById('loginusername').value='nesrine';");

		JavascriptExecutor jsPW = (JavascriptExecutor) driver;
		jsPW.executeScript("document.getElementById('loginpassword').value='123';");

		WebElement btnsubmit = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",btnsubmit);
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("next2")).click();
		driver.findElement(By.linkText("MacBook Pro")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")));
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("cartur")).click();
//		String total = driver.findElement(By.id("totalp")).getText();
//		System.out.println("total is : "+total);
		
		WebElement result = driver.findElement(By.id("totalp"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.id("totalp"), pattern));
		System.out.println("The result is : " +result.getText());
		
		WebElement delete = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/a"));
		delete.click();
		WebElement result1 = driver.findElement(By.id("totalp"));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern1 = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.id("totalp"), pattern1));
		System.out.println("The result is : " +result1.getText());
	
				
	
	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
