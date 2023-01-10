package com.e2etests.automation.utils.testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseSwitchWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		// store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		// Click on the button New window message
		driver.findElement(By.id("messageWindowButton")).click();

		// Store and print the name of all the window open
		Set<String> handles = driver.getWindowHandles();// ensemble de String ==> Set
		System.out.println(handles);

		// Pass a window handle to another window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		driver.quit();

	}

}
