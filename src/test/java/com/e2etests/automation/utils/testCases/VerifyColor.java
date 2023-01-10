package com.e2etests.automation.utils.testCases;

import org.openqa.selenium.By;import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		//verify color
		String color = driver.findElement(By.linkText("Mot de passe oublié ?")).getCssValue("color");
		System.out.println("The color is:" +color);
		
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
		System.out.println("The hexValue is:" +hexValue);
		
		int hexValue1 = Integer.parseInt(hexValue [0]);
		hexValue[1] = hexValue[1].trim();
		System.out.println("The hexValue1 is:" +hexValue1);
		
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		System.out.println("The hexValue2 is:" +hexValue2);
		
		int hexValue3 = Integer.parseInt(hexValue[2]);
		System.out.println("The hexValue3 is:" +hexValue3);
		
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("The actualColor is:" +actualColor);
		
		Assert.assertEquals("#1877f2", actualColor);
		System.out.println("The color is:" +actualColor);
		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
		
		//Scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)", "");

		driver.quit();
	}

}
