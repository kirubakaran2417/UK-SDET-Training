package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features",
        glue = "stepDefinitions",
        tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {

}
