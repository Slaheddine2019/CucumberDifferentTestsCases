package com.e2etests.automation.utils.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTypeDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		
		//verify
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {//je mon fou max ou min
			System.out.println("Pass: ToolTip matching expected value");
		}else {
			System.out.println("fail: ToolTip not matching expected value");
		}
		driver.quit();
		
		
	}

}
