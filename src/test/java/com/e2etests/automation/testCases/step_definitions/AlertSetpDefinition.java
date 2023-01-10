package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.AlertPage;
import com.e2etests.automation.utils.commands.CommandsUtils;
import com.e2etests.automation.utils.commands.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSetpDefinition {
  
public AlertPage alertPage;
public SeleniumUtils seleniumUtils;
public CommandsUtils commands ;


	public AlertSetpDefinition() {

		alertPage = new AlertPage();
		seleniumUtils = new SeleniumUtils();
		commands = new CommandsUtils();
	}

	@Given("Je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String url) {

		//seleniumUtils.get(url);
		
		commands.opentUrl(url);

	}

	@When("Je clique sur le bouton alert")
	public void jeCliqueSurLeBoutonAletBoutton() throws InterruptedException {

		//seleniumUtils.click(AlertPage.alertButton);
		
		commands.acceptAlert();

	}

	@When("Je accepte alert")
	public void jeAccepteLAlerte() {

		seleniumUtils.acceptAlert();
	}

	@Then("Je verifie le titre de la page")
	public void jeVerifieLeTitreDeLaPage() {
		
		alertPage.checkTitle();
	}
}
