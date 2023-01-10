package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	public WebDriver driver;
	@BeforeTest
	public void setup () {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://mytestingthoughts.com/Sample/home.html");
		//https://mytestingthoughts.com/automation-testing-registration-form/
	}
	@Test
	public void robotTest () {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("nesrine");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("oueslati");
		driver.findElement(By.id("inlineRadioFemale")).click();
		WebElement dropDownList = driver.findElement(By.id("exampleFormControlSelect2"));
		Select se = new Select(dropDownList);
		se.selectByIndex(3);
		WebElement dropDownList2 = driver.findElement(By.xpath("//select[@name='department']"));
		Select se2 = new Select(dropDownList2);
		se2.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("nesrineoues");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nesrine@gmail.com");
		driver.findElement(By.xpath("//input[@name='contact_no']")).sendKeys("123452971608");
		driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
