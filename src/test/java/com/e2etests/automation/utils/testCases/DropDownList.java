package com.e2etests.automation.utils.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver ();
		
		// open url / app my store
		driver.get("https://demoqa.com/select-menu");
		
		//Create object of the select class
		WebElement dropDownList = driver.findElement(By.id("oldSelectMenu"));
		Select se = new Select(dropDownList);
		
		//se.selectByIndex(5);
		se.selectByValue("10");
		//se.selectByVisibleText("Green");
		
		// select the multiple values from a dropdown
		//Select selectByValue = new Select(driver.findElement(By.id("cars")));
		//selectByValue.selectByValue("volvo");
		//selectByValue.selectByVisibleText("Saab");
		//selectByValue.selectByIndex(3);
		
	
		
		
		
		
		

	}

}
