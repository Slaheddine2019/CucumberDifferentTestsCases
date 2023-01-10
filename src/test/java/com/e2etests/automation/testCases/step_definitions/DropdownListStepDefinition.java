package com.e2etests.automation.testCases.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.testCases.page_objects.DropdownListStepPage;
import com.e2etests.automation.utils.commands.CommandsUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DropdownListStepDefinition {

	public DropdownListStepPage dropdownListStepPage;
	public CommandsUtils commands;

	public DropdownListStepDefinition() {

		dropdownListStepPage = new DropdownListStepPage();
		commands = new CommandsUtils();
	}

	@Given("Je clique sur la liste deroulante et je choisis la couleure bleue")
	public void jeCliqueSurLaListeDeroulanteEtJeChoisisLaCouleureBleue() {

		commands.selectByVisibleTextDropDownList(DropdownListStepPage.dropdown, "Blue");
		
	}

	@Then("Je verifie le texte de la couleur choisis dans la liste")
	public void jeVerifieLeTexteDeLaCouleurChoisisDansLaListe() {

		Select sel = new Select(DropdownListStepPage.dropdown);
		String textColroExpected = "Blue";
		String textColroActual = sel.getFirstSelectedOption().getText();
		Assert.assertEquals(textColroActual, textColroExpected);
	}

}
