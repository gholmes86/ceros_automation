package test.featuretest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "step_definitions",
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber/Cucumber.json"},
		tags = { "@regression", "~@ignore" }

)
public class CerosRegressionTest {
	
}