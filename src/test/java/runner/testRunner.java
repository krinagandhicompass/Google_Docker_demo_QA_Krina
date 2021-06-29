package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinations" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json" })

public class testRunner {
}
