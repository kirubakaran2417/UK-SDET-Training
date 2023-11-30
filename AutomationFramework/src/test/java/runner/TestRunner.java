package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", glue = "stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

}
