# WilliamHill
Test for placing a bet on a particular game

## Software Requirements
* [Maven](https://maven.apache.org/)

To run the tests on Google Chrome:
* [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
* Set a system variable of "webdriver.chrome.driver" to point to the file downloaded above, either permanently or as part of running Maven: `mvn test -Dwebdriver.chrome.driver=path/to/chromedriver`

## Running the tests
* Open a terminal/command prompt and navigate to the root of the tests
* Run `mvn test`

## Configuring Launcher
* Open src/test/resources/config.properties
* Adjust the browser section to either Chrome or AndroidEmulation
* e.g browser:AndroidEmulation, browser:Chrome

Reports from the test are output to the folder 'reports', separated into folders based on date, platform and browser.

You can also add configurations to the `mvn test` command:
* Passing through any of the config.properties values as system properties, e.g. `mvn test -Dbrowser=Firefox -DseleniumEnvironment=grid`
* Specifying a tag to run from the feature files, e.g. `mvn test -Dcucumber.tags=@search`
