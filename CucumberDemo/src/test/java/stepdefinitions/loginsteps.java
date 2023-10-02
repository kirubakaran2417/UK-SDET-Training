package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginsteps {
    //Webdriver reference
    WebDriver driver;
    @Given("Open the browser and redirect to practicetestautomation")
    public void open_the_browser_and_redirect_to_practicetestautomation() {
       driver = new ChromeDriver();
       driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @When("Enter valid details for the {string} and {string}")
    public void enter_valid_details_for_the_username_and_password(String username,String paass) {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
    }
    @Then("validate the success message")
    public void validate_the_success_message() {
        String expectedText="Your username is invalid!";
        String actualMessage = driver.findElement(By.xpath("//div[@class=\"post-content\"]//p//strong")).getText();
        Assert.assertEquals(expectedText, actualMessage);
    }
    @When("Enter invalid username and valid password")
    public void enter_invalid_username_and_valid_password() {
        driver.findElement(By.id("username")).sendKeys("student123");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
    }
    @Then("validate the error message")
    public void validate_the_error_message() {
        String expectedText="Invalid username or password.";
        String actualMessage = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(expectedText, actualMessage);
    }

    @When("Enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password");
        driver.findElement(By.id("submit")).click();
    }
}
