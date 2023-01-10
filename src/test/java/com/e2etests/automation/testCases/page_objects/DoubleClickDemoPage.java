package com.e2etests.automation.testCases.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.commands.Setup;

public class DoubleClickDemoPage {

	final static String DOUBLE_CLICK_BUTTON = "doubleClickBtn";
	final static String DOUBLE_CLICK_MESSAGE = "doubleClickMessage";

	@FindBy(how = How.ID, using = DOUBLE_CLICK_BUTTON)
	public static WebElement doubleClickButton;

	@FindBy(how = How.ID, using = DOUBLE_CLICK_MESSAGE)
	public static WebElement doubleClickMessage;

	public DoubleClickDemoPage() {

		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void maximizeBrowser() {

		Setup.getDriver().manage().window().maximize();
	}

	public void switverifyTextMessage() {

	}

}
