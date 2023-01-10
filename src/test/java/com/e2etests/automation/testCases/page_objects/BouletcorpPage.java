package com.e2etests.automation.testCases.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.commands.CommandsUtils;
import com.e2etests.automation.utils.commands.Setup;

public class BouletcorpPage {
	
public  CommandsUtils commands ;

	public final static String ALEATOIRE_LINK = "Aléatoire";
	final static String BUTTON_ALEATOIRE = "//*[contains(text(),'Aléatoire')]";
	final static String FACEBOOK_WIDGET = "//img[@title= 'Facebook']";
	final static String TWITTER_WIDGET = "//img[@title= 'Twitter']";
	final static String TUMBLR_WIDGET = "//a[@title= 'Share on Tumblr']";
	
	

	@FindBy(how = How.LINK_TEXT, using = ALEATOIRE_LINK)
	public static WebElement aleatoireLink;

	@FindBy(how = How.XPATH, using = FACEBOOK_WIDGET)
	public static WebElement facebookWidget;

	@FindBy(how = How.XPATH, using = TWITTER_WIDGET)
	public static WebElement TwitterWidges;

	@FindBy(how = How.XPATH, using = TUMBLR_WIDGET)
	public static WebElement timblerWidget;
	
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		commands = new CommandsUtils();
	}

}
