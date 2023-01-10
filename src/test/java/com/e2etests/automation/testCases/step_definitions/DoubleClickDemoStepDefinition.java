package com.e2etests.automation.testCases.step_definitions;


import org.junit.Assert;
import com.e2etests.automation.testCases.page_objects.DoubleClickDemoPage;
import com.e2etests.automation.utils.commands.CommandsUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickDemoStepDefinition {
	
public DoubleClickDemoPage doubleClickDemoPage;
public CommandsUtils commands ;

	public DoubleClickDemoStepDefinition() {
		
		doubleClickDemoPage = new DoubleClickDemoPage();
		
		 commands = new CommandsUtils ();
	}

	@When("Je fais un double clique sur le bouton")
	public void jeFaisUnDoubleCliqueSurLeBouton() {
		

		commands.doubleClick(DoubleClickDemoPage.doubleClickButton);
		
	}
	
	@Then("Je verifie le message text qui s affiche")
	public void jeVerifieLeTitreAffiche() {
		
		String actualMessageText = DoubleClickDemoPage.doubleClickMessage.getText();
		String expectedMessageText = "You have done a double click";
		Assert.assertEquals(actualMessageText, expectedMessageText);
	}

}
