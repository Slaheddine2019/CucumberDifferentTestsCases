package com.e2etests.automation.utils.draft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
		public WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Fleure");
		//driver.findElement(By.xpath("//input[@value='Recherche Google']")).click();// mauvaise choix
		List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println("total number of suggestion in search box:::===> "+ list.size());
		/*for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText().contains("fleure rouge"));
			list.get(i).click();  
			break;
		}*/
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

	
}
