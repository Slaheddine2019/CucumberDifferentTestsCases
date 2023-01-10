package com.e2etests.automation.testCases.step_definitions;


import org.junit.Assert;
import com.e2etests.automation.testCases.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.commands.CommandsUtils;
import com.e2etests.automation.utils.commands.SeleniumUtils;
import com.e2etests.automation.utils.commands.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinitions {
	
public BouletcorpPage bouletcorpPage;
public SeleniumUtils seleniumUtils;
public CommandsUtils commands ;

public BouletcorpStepDefinitions() {
	
	bouletcorpPage = new BouletcorpPage();
	seleniumUtils = new SeleniumUtils();
	commands = new CommandsUtils();
	
	}
	
	@When("Je clique sur le link aleatoire")
	public void jeCliqueSurLeLinkAleatoire() {
		
		commands.clickOnButton(BouletcorpPage.aleatoireLink);
	  
	}
	@Then("Je verifie que la page a changee")
	public void jeVerifieQueLaPageAChangee() {
		
		String pageTittle1 = "bouletcorp";
		String pageTittle2 = Setup.getDriver().getTitle();
		Assert.assertNotEquals(pageTittle1, pageTittle2);
		commands.scrollerBottom();
	 
	}
	@Then("Je verifie les widgets facebook, twitter et tumblr sont bien affiches")
	public void jeVerifieLesWidgetsFacebookTwitterEtTumblrSontBienAffiches() {
			
		boolean facebook = commands.isElementDisplayed(BouletcorpPage.facebookWidget);
		boolean twitter = commands.isElementDisplayed(BouletcorpPage.TwitterWidges);
		boolean timbler = commands.isElementDisplayed(BouletcorpPage.timblerWidget);
		Assert.assertTrue(facebook);
		Assert.assertTrue(twitter);
		Assert.assertTrue(timbler);
		
	}
}
