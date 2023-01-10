package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.commands.SeleniumUtils;
import com.e2etests.automation.utils.commands.Setup;


public class AlertPage {
public SeleniumUtils seleniumUtils ;
	
   final static String ALERT_BUTTON ="alertButton";


	@FindBy(how = How.ID, using = ALERT_BUTTON)
	public static WebElement alertButton;

	public AlertPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
		seleniumUtils = new SeleniumUtils();
	}
	
	

	public void checkTitle() {
		
		String title = Setup.getDriver().getTitle(); 
		System.out.println("the title of application is: "+ title);
	}

}
