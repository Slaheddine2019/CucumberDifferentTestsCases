package com.e2etests.automation.testCases.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.commands.Setup;
import com.e2etests.automation.utils.testCases.ConfigFileReader;

public class FirstTestCasePage {
	
	public ConfigFileReader configFileReader;
	
	final static String USERNAME_BOX = "Email";
	final static String PASSWORD_BOX = "Password";
	final static String LOGIN_BUTTON = "[type='submit']" ;
	
	@FindBy(how = How.ID, using = USERNAME_BOX)
	public static WebElement username;

	@FindBy(how = How.ID, using = PASSWORD_BOX )
	public static WebElement password;

	@FindBy(how = How.CSS, using = LOGIN_BUTTON)
	public static WebElement LoginButton;

	public FirstTestCasePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}


}
