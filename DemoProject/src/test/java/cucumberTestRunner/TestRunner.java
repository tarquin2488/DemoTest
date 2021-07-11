package cucumberTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles", glue = "stepDefinition", monochrome = true, tags = "@LoginTest1 or @LoginTest2 or @RegisterTest1 or @RegisterTest2", plugin = {
		"pretty", "html:target/cucumber/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml" })
public class TestRunner {

}
