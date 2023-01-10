package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		action.moveToElement(slider, 50, 0).clickAndHold().build().perform();
		//slider.click();
		driver.quit();
		

	}

}
