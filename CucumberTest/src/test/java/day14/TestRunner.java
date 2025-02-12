package day14;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\PC\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Features\\login.feature",
		glue = {"StepDefinitions"},
		plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"},
		monochrome = true,
		publish = true
		
		)
public class TestRunner {

}
