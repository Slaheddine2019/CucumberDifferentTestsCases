package com.e2etests.automation.utils.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait;
	private static String filePath = "C:\\Users\\Nesrine\\Desktop\\Formation séleniumtest.docx";

	@BeforeMethod
	public void setup() {//Method setup() role open navigateur and app et maximize
		// open chrome selon type de naviagteur
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		// open app
		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		
		/*******/
		driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(10)));//implicite debut pageLoad et terminer par kill browser
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicite
		/*******/
		
		// maximize window
		driver.manage().window().maximize();
	}

	@Test // ****???? import test junit ??????//
	public void robotTest() throws InterruptedException {// Methode robotTest() cas de test
		/********/
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));//
		/********/
		
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		uploadFileWithRobot(filePath);
		
		/*******/
		Thread.sleep(3000);//relente bonde de test
		/*******/
	}
	//close chrome
	@AfterMethod
	public void tearDown() {//Methode tearDown but quit navigateur
		driver.quit();
	}

	// file Upload by robot class
	public void uploadFileWithRobot(String imagePath) {
		StringSelection stringSelection = new StringSelection(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);// setContents il faut deux attributs donc par defaut
		
		/***********/
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		/********/
		
		// clavier virtual
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);//nenzel VK virtual Keyboard
		robot.keyRelease(KeyEvent.VK_ENTER);//nsayeb idi
		robot.keyPress(KeyEvent.VK_CONTROL);// copier path
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
