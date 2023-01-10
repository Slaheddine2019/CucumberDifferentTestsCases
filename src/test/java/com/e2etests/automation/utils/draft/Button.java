package com.e2etests.automation.utils.draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url ="https://www.demoblaze.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@onclick='byCat('notebook')']")).click();

	}

}
