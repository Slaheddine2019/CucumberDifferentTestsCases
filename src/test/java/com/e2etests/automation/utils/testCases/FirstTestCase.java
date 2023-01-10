package com.e2etests.automation.utils.testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver ();
		
		//implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open url / app my store
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		//maximize browser
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		// fill user name
		driver.findElement(By.id("email")).sendKeys("ziedhannachi0@gmail.com");

		//Thread.sleep(3000);
		
		// fill passWord
		driver.findElement(By.id("passwd")).sendKeys("Admin123");

		// click on signin button
		//driver.findElement(By.id("SubmitLogin")).click();
		
		//click on signin button with explicite wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnSubmitLogin;
		btnSubmitLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
		
		String contact = driver.findElement(By.id("contact-link")).getText();
		Assert.assertEquals("Contact us", contact);
		
		System.out.println("login successfully");
		btnSubmitLogin.click();
		
		// close browser
		driver.quit();

		//driver.close();
		
		
		
		

	}

}
