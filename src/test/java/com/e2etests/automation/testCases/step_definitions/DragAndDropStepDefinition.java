package com.e2etests.automation.testCases.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.testCases.page_objects.DragAndDropPage;
import com.e2etests.automation.utils.commands.CommandsUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DragAndDropStepDefinition {

	public DragAndDropPage dragAndDropPage;
	public CommandsUtils commands;

	public DragAndDropStepDefinition() {

		dragAndDropPage = new DragAndDropPage();
		commands = new CommandsUtils();
	}

	@Given("Je deplace le fichier drap me au fichier drop here")
	public void jeDeplaceLeFichierDrapMeAuFichierDropHere() {
		
		commands.DragAndDrop(DragAndDropPage.sourceFolder, DragAndDropPage.targetFolder);
	}

	@Then("Je verifie le message text qui s affiche dans drop here")
	public void JeVerifieLeMessageTextQuisAfficheDansDropHere() {

		String actualMessageText = DragAndDropPage.targetFolder.getText();
		String expectedMessageText = "Dropped!";
		Assert.assertEquals(actualMessageText, expectedMessageText);

	}

}
