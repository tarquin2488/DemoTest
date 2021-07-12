package stepDefinition;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webDriver.BaseWebDriver;


public class Hooks{


	static WebDriver driver;
	@Before
	public void beforeScenario(Scenario scenario) {
		driver=BaseWebDriver.getDriver();
		scenario.log("This will run before the Scenario");

	}

	@After
	public void afterScenario(Scenario scenario) {
	
		driver.quit();
		scenario.log("This will run after the Scenario");
	}

}
