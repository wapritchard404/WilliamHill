package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.WebElementIdentifiers;
import webDriver.Driver;

public class HelperFunctions {

	static WebDriver driver = Driver.getCurrentDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public static void Login(String username, String password){
		
		WebElementIdentifiers.accountTabButton().click();
		WebElementIdentifiers.usernameField().sendKeys(username);
		WebElementIdentifiers.passwordField().sendKeys(password);
		WebElementIdentifiers.loginButton().click();
		WebElementIdentifiers.loggedIn();
	}
	
	public void waitUntilCountChanges(final String lookup) {
		//Using this wait for dynamically loaded elements
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				int elementCount = driver.findElements(By.className("" + lookup + "")).size();
                if (elementCount > 1)
                    return true;
                else
                    return false;
            }
        });
    }
}
