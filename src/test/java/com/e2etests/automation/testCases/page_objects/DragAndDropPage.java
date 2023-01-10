package com.e2etests.automation.testCases.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.commands.Setup;

public class DragAndDropPage {
	
	final static String SOURCE_FOLDER = "draggable";
	final static String TARGET_FOLDER = "droppable";

	@FindBy(how = How.ID, using = SOURCE_FOLDER )
	public static WebElement sourceFolder;
	
	@FindBy(how = How.ID, using = TARGET_FOLDER )
	public static WebElement targetFolder;

	public DragAndDropPage() {
		
		PageFactory.initElements(Setup.getDriver(), this);
	}

}
