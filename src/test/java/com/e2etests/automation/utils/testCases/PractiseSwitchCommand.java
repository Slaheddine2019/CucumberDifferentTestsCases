package com.e2etests.automation.utils.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver ();
		
		// open url / app my store
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//Switching the frame by Id
		driver.switchTo().frame("a077aa5e");
		System.out.println("***we are swith to the Iframe***");
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***we are done***");
		//driver.close(); 
		//driver.quit(); 
	}

}
