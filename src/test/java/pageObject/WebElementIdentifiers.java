package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriver.Driver;

public class WebElementIdentifiers {

	static WebDriver driver = Driver.getCurrentDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public static String searchResultsTitle() {
		return driver.getTitle();
	}
	
	public static WebElement accountTabButton(){
		return driver.findElement(By.className("account-tab__button"));
	}
	
	public static WebElement usernameField(){
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement passwordField(){
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(){
		return driver.findElement(By.xpath("//button/span[contains(text(),'Login')]"));
	}
	
	public static WebElement loggedIn(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("icon-accountLI")));
		return driver.findElement(By.className("icon-accountLI"));
	}
	
	public static WebElement footballSectionNavigationButton(){
		return driver.findElement(By.id("nav-football"));
	}
	
	public static List<WebElement> mobileMenu(){
		return driver.findElements(By.className("btn--tiny"));
	}
	
	public static List<WebElement> compitionsButton(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='/betting/en-gb/football/competitions']")));
		return driver.findElements(By.cssSelector("a[href*='/betting/en-gb/football/competitions']"));
	}
	
	public static List<WebElement> searchButton(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("navSearch")));
		return driver.findElements(By.className("navSearch"));
	}
	
	public static String searchButtonLookup(){
		return "navSearch";
	}
	
	public static WebElement backButton(){
		return driver.findElement(By.id("back-button"));
	}
	
	public static WebElement showMoreButton(){
		return driver.findElement(By.xpath("//*[@data-id='Euro-2016-and-International-OB_TY9392-Euro-2016-countdown']"));
	}
	
	public static WebElement searchResults(){
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".search-results .-display-inline-block")));
	}
	
	public static WebElement teamToBetOn(String team){
		return  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-name='" + team + "']")));
	}
	
	public static WebElement getTeamOdds(WebElement elem){
		return elem.findElement(By.className("betbutton__odds"));
	}
	
	public static String eurosTournamentLookup(){
		return "header__toolbar";
	}
	
	public static List<WebElement> eurosTournamentDropdown(){
		return driver.findElements(By.className("header__toolbar"));
	}
	
	public static WebElement betSlipButton(){
		return driver.findElement(By.className("bet-slip"));
	}
	
	public static WebElement mobileBetSlipButton(){
		return driver.findElement(By.id("mobile-betslip-link"));
	}

	public static WebElement searchField(){
		return driver.findElement(By.id("search-input"));
	}
	
	public static WebElement stakeInputField(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("stake-input")));
		return driver.findElement(By.className("stake-input"));
	}
	
	public static WebElement betSlipSection(){
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("betslip-section")));
	}
	
	public static WebElement estimatedReturns(){
		return wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".estimated-returns .ng-binding"))));
	}
	
	public static WebElement placeBetButton(){
		return driver.findElement(By.id("place-bet-button"));
	}
	
}
