package com.e2etests.automation.utils.commands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommandsUtils extends BasePage {

	public WebDriver driver;

	public CommandsUtils() {

		this.driver = Setup.getDriver();

	}

	public void acceptAlert() {

		Setup.getDriver().switchTo().alert().accept();

	}

	public void dismissAlert() {

		Setup.getDriver().switchTo().alert().dismiss();
	}

	public void opentUrl(String url) {

		Setup.getDriver().get(url);

	}

	public void clickOnButton(WebElement element) {

		element.click();

	}

	public void scrollerBottom() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	}

	public boolean isElementDisplayed(WebElement element) {

		boolean isElementIsDisplayed = element.isDisplayed();

		return isElementIsDisplayed;
	}

	public void doubleClick(WebElement element) {

		Actions action = new Actions(driver);

		action.doubleClick(element).perform();
		
	}

	public void DragAndDrop(WebElement source, WebElement Target) {

		Actions action = new Actions(Setup.getDriver());

		action.dragAndDrop(source, Target).perform();

	}

	public void selectByValueDopdownList(WebElement element, String value) {

		Select select = new Select(element);

		select.selectByValue(value);

	}

	public void selectByIndexDopdownList(WebElement element, int index) {

		Select select = new Select(element);

		select.selectByIndex(index);

	}

	public void selectByVisibleTextDropDownList(WebElement element, String text) {

		Select select = new Select(element);

		select.selectByVisibleText(text);

	}

	public void writeText(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);
	}

	public void moveToElement(WebElement element) {

		Actions actions = new Actions(Setup.getDriver());

		actions.moveToElement(element);

	}

	public void MultiSelectByIndex(WebElement element, By locator, int index) {

		Select select = new Select(Setup.getDriver().findElement(locator));

		List<WebElement> options = select.getOptions();

		if (select.isMultiple()) {

			select.selectByIndex(index);

		}
	}

	public void MultiSelectByValue(WebElement element, By locator, String value) {

		Select select = new Select(Setup.getDriver().findElement(locator));

		List<WebElement> options = select.getOptions();

		if (select.isMultiple()) {

			select.selectByValue(value);

		}
	}

	public void MultiSelectByVisibleText(WebElement element, By locator, String text) {

		Select select = new Select(Setup.getDriver().findElement(locator));

		List<WebElement> options = select.getOptions();

		if (select.isMultiple()) {

			select.selectByVisibleText(text);

		}

	}

	public void deselectMultipleSelected(WebElement element, By locator, int index) {

		Select select = new Select(Setup.getDriver().findElement(locator));

		List<WebElement> selectedOptions = select.getAllSelectedOptions();

		for (WebElement selectedOption : selectedOptions) {

			select.deselectByIndex(index);

		}
		
		

	}
	
	public void autoSuggestionDropdown(WebElement element , String text1 ,String text2) throws InterruptedException  {
		
		element.sendKeys(text1);
		Thread.sleep(5000);
		
				
	
		
		List<WebElement> options = Setup.getDriver().findElements(By.cssSelector("[class='ui-menu-item']"));
		
		for(WebElement option1 :options ) {
			
			
			if(option1.getText().equalsIgnoreCase(text2)) {
				
				option1.click();
				break;
				
			}
		}
		
		
		
		
	}
	
	
	public void waitUntilElementToBeVisible(WebElement element ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	

}
