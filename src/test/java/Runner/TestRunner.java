package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Drastic\\eclipse-workspace\\SeleniumCucumberProjects\\src\\main\\java\\Features\\login.feature",
		glue = {"StepDefinitions"},
		plugin = {"pretty","html:test-output"},
		dryRun = false,
		strict = true
		)

public class TestRunner {

	
}
