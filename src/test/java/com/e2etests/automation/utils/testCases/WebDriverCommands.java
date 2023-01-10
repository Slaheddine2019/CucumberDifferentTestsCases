package com.e2etests.automation.utils.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println("The title of the page is:" +titlePage);
		int titleLength = titlePage.length();
		System.out.println("The length of the title is:" + titleLength);
		
		String actuallUrl = driver.getCurrentUrl();
		if (actuallUrl.equals(url)){
			System.out.println("Verification successfully - The correct url is opned ");
		}else {
			System.out.println("Verification failed - an incorrect url is opned ");
		}
		System.out.println("Actual URL is: " + actuallUrl);
		System.out.println("Expected URL is: " + url);
		String sourcePage = driver.getPageSource();
		int lengthPageSource = sourcePage.length();
		System.out.println("Length of the page source :" + lengthPageSource);
		driver.quit();
		System.out.println("Actual URL is: " + actuallUrl);
		
	
	
	
	}

}
