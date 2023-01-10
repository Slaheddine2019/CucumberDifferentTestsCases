package com.e2etests.automation.testCases.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.testCases.page_objects.FirstTestCasePage;
import com.e2etests.automation.utils.commands.CommandsUtils;
import com.e2etests.automation.utils.commands.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FirstTestCaseStepDefinition {

	public FirstTestCasePage firstTestCasePage;
	public CommandsUtils commands ;

	public FirstTestCaseStepDefinition() {
		
		firstTestCasePage = new FirstTestCasePage();
		commands = new CommandsUtils ();
	}

	@Given("Je saisis le username {string}")
	public void jeSaisisLeUsername(String name) {
		
		commands.writeText(FirstTestCasePage.username, name);
		
	}

	@Given("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		
		commands.writeText(FirstTestCasePage.password, password);
		
	}

	@Given("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		
		commands.clickOnButton(FirstTestCasePage.LoginButton);
		
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

		String ActualdUrl = Setup.getDriver().getCurrentUrl();
		String ExpectedUrl = "https://admin-demo.nopcommerce.com/admin/";
		Assert.assertEquals(ActualdUrl, ExpectedUrl);
	}

}
