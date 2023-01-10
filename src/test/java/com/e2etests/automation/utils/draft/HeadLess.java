package com.e2etests.automation.utils.draft;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess {
		
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors");

		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://juliemr.github.io/protractor-demo/");
		driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(10)));

		//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

}
