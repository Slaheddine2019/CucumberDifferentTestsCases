package com.e2etests.automation.utils.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		WebElement username = driver.findElement(By.name("username"));
		
		String attValue = username.getAttribute("name");
		System.out.println("The attribute value is :" + attValue);
		
		driver.findElement(By.name("password")).clear();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		Dimension dimensions = username.getSize();
		System.out.println("Hight: " +dimensions.height + "Width: " +dimensions.width);
		
		Point point = password.getLocation();
		System.out.println("x cordinate: "+  point.x +  "Y cordinate: " +point.y);
		
		//Verifier si le bouton login affiché vrai / faux
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type'submit']"));
		boolean result = btnLogin.isDisplayed();
		System.out.println(result);
		
		//verifier si le bouton Login activé vrai / faux
		boolean status1 = btnLogin.isEnabled();
		System.out.println("status1");
		
		//Verifier si le bouton login existe vrai / faux
		List<WebElement> btnLogin1 = driver.findElements(By.xpath("//button[@type'submit']"));
		if(btnLogin1.size() != 0) {
			System.out.println("The button is exist");
		}else {
			System.out.println("The button does not exist");
		}
		
	}

}
