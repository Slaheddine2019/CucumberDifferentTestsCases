package com.e2etests.automation.testCases.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.commands.Setup;

public class MultiSelectPage {
	
	public final static String TEXT_CHOICE = "cars" ;

	@FindBy(how = How.ID, using = TEXT_CHOICE)
	public static WebElement nameChoices;
	
	
	

	public MultiSelectPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

//	
	public void getChoice(){
		
		Select select = new Select(Setup.getDriver().findElement(By.id("cars")));
		
		List<WebElement> options = select.getOptions();

		for (WebElement option : options)
			System.out.println(option.getText());
		if (select.isMultiple()) {

			// Selecting option as 'Opel'-- ByIndex
			System.out.println("Select option Opel by Index");
			select.selectByIndex(2);

			// Selecting the option as 'Saab'-- ByValue
			System.out.println("Select option saab by Value");
			select.selectByValue("saab");

			// Selecting the option by text
			System.out.println("Select option Audi by Text");
			select.selectByVisibleText("Audi");

			// Get the list of selected options
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

			// Deselect the value "Audi" by Index
			System.out.println("DeSelect option Audi by Index");
			select.deselectByIndex(3);

			// Deselect the value "Opel" by visible text
			System.out.println("Select option Opel by Text");
			select.deselectByVisibleText("Opel");

			// Validate that both the values are deselected
			System.out.println("The selected values after deselect in the dropdown options are -");
			List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

			for (WebElement selectedOptionAfterDeselect : selectedOptionsAfterDeselect)
				System.out.println(selectedOptionAfterDeselect.getText());

			// Step#8- Deselect all values
			select.deselectAll();
		
			
	}

}

}
