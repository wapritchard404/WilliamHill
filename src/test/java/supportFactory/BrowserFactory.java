package supportFactory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import enums.Browser;
import testRunner.TestRunner;

public class BrowserFactory {
	
	
	static Browser browser = Browser.valueOf(TestRunner.config.get("browser"));
	
	static String desiredBrowserVersion = TestRunner.config.get("browserVersion");

	public static DesiredCapabilities selectBrowser(DesiredCapabilities caps) {
		
		switch (browser) {
		case AndroidEmulation:
			break;
		case Chrome:
			caps.setCapability("browserName", "chrome");
			break;
		default:
			throw new WebDriverException("No browser specified");
		}
		caps.setCapability("version", desiredBrowserVersion);
		return caps;
	}
	
	public static WebDriver selectLocalBrowser() {
		switch (browser) {
		//Capabilities for Android Emulation through ChromeDriver
		case AndroidEmulation:
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			//This name needs to match the emulation device within the chrome device list
			mobileEmulation.put("deviceName", "Google Nexus 5");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			WebDriver driver = new ChromeDriver(capabilities);
			return driver;
		//Capabilities for Chrome	
		case Chrome:
			return new ChromeDriver();
		default:
			throw new WebDriverException("No browser specified");
		}
	}
}
