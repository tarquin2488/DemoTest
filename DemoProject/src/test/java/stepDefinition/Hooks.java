package stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webDriver.BaseWebDriver;


public class Hooks extends BaseWebDriver{

	@Before
	public void beforeScenario(Scenario scenario) {
		scenario.log("This will run before the Scenario");

	}

	@After
	public void afterScenario(Scenario scenario) {
	
		driver.close();
		scenario.log("This will run after the Scenario");
	}

}
