package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.commands.Setup;

public class DropdownListStepPage {

	final static String DROPDOWN_LIST = "oldSelectMenu";

	@FindBy(how = How.ID, using = DROPDOWN_LIST)
	public static WebElement dropdown;

	public DropdownListStepPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	}
