package com.e2etests.automation.testCases.step_definitions;

import org.openqa.selenium.By;
import com.e2etests.automation.testCases.page_objects.MultiSelectPage;
import com.e2etests.automation.utils.commands.CommandsUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultiSelectStepDefinition {

	public MultiSelectPage multiSelectPage;
	public CommandsUtils commands;

	public MultiSelectStepDefinition() {

		multiSelectPage = new MultiSelectPage();
		commands = new CommandsUtils();
	}

	@Given("Je selectionne tous les options")
	public void JeSelectionneTousLesOptions() {

		commands.MultiSelectByIndex(MultiSelectPage.nameChoices,By.id(MultiSelectPage.TEXT_CHOICE) , 0);
		commands.MultiSelectByValue(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), "saab");
		commands.MultiSelectByVisibleText(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), "Opel");
		commands.MultiSelectByIndex(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), 3);
	}

	@And("Je deselectionne tous les options")
	public void JeDeSelectionneTousLesOptions() {

		commands.deselectMultipleSelected(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), 0);
		commands.deselectMultipleSelected(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), 1);
		commands.deselectMultipleSelected(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), 2);
		commands.deselectMultipleSelected(MultiSelectPage.nameChoices, By.id(MultiSelectPage.TEXT_CHOICE), 3);

	}
		

}
