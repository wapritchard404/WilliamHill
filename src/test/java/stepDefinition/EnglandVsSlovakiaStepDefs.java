package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.WebElementIdentifiers;
import pageObject.HelperFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.Driver;

public class EnglandVsSlovakiaStepDefs {

	static WebDriver driver = Driver.getCurrentDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	HelperFunctions helper = new HelperFunctions();
	String team;
	
	@Given("^I am on the William Hill website$")
	public void i_am_on_the_William_Hill_website() throws Throwable {
		
		//Navigate to the William Hill site and login using test account
		driver.get("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html");
		HelperFunctions.Login("WHATA_FOG9", "F0gUaTtest");
	}
	
	@Given("^I have navigated to the euro competition section$")
	public void i_have_navigated_to_the_euro_competition_section() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(WebElementIdentifiers.footballSectionNavigationButton())).click();
		wait.until(ExpectedConditions.visibilityOf(WebElementIdentifiers.compitionsButton().get(1))).click();
		helper.waitUntilCountChanges(WebElementIdentifiers.eurosTournamentLookup());
		wait.until(ExpectedConditions.visibilityOf(WebElementIdentifiers.eurosTournamentDropdown().get(2))).click();
	}
	
	@Given("^I have picked a \"([^\"]*)\" I wish to bet on$")
	public void i_have_picked_a_I_wish_to_bet_on(String match) throws Throwable {
		
		//DEVNOTE: Show more button not returning additional odds so need to search for match
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HomePage.showMoreButton());
		//HomePage.showMoreButton().click();
		
		WebElementIdentifiers.backButton().click();
		helper.waitUntilCountChanges(WebElementIdentifiers.searchButtonLookup());
		wait.until(ExpectedConditions.elementToBeClickable(WebElementIdentifiers.searchButton().get(1))).click();
		WebElementIdentifiers.searchField().sendKeys(match);
		WebElementIdentifiers.searchResults().click();
	}
	
	@When("^I place a \"([^\"]*)\" on a \"([^\"]*)\" to win$")
	public void i_place_a_on_a_to_win(String betAmount, String team) throws Throwable {
		this.team = team;
		WebElementIdentifiers.teamToBetOn(team).click();
		WebElementIdentifiers.mobileBetSlipButton().click();
		WebElementIdentifiers.betSlipSection();
		WebElementIdentifiers.stakeInputField().click();
		WebElementIdentifiers.stakeInputField().sendKeys(betAmount);
	}

	@Then("^I am given the odds and returns$")
	public void i_am_given_the_odds_and_returns() throws Throwable {
		String odds = WebElementIdentifiers.getTeamOdds(WebElementIdentifiers.teamToBetOn(team)).getAttribute("innerHTML");
		String returns = WebElementIdentifiers.estimatedReturns().getAttribute("innerHTML");
		Assert.assertNotNull(returns);
		Assert.assertNotNull(odds);
		WebElementIdentifiers.placeBetButton().click();
	}	
}
