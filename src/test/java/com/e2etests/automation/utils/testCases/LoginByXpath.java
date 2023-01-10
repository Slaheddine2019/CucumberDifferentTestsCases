package com.e2etests.automation.utils.testCases;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class LoginByXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// open url / app my store
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		//maximize browser
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		// fill user name
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ziedhannachi0@gmail.com");

		//Thread.sleep(3000);
		
		// fill passWord
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Admin123");

		// click on signin button
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		
		String contact = driver.findElement(By.id("contact-link")).getText();
		Assert.assertEquals("Contact us",contact);
		
		//System.out.println("login successfully");
		//btnSubmitLogin.click();
		
		// close browser
		driver.quit();

	}

}
