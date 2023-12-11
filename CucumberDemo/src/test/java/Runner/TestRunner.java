package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "classpath:features/Login.feature",
    glue = "stepdefinitions",
    tags = "@regression",
    plugin = {"pretty", "html:target/cucumber-html-report.html",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
