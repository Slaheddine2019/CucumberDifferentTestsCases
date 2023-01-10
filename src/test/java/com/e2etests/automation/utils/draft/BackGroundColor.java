package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGroundColor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		String color = driver.findElement(By.id("u_0_0_7u")).getCssValue("background-color");
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
		
		Assert.assertEquals("#42b72a", actualColor);
		System.out.println("The color is:" +actualColor);

	}

}
