package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("open the browser")
    public void open_the_browser() {
        System.out.println("open the browser");
    }
    @Given("redirect to the login page")
    public void redirect_to_the_login_page() {
        System.out.println("redirect to the login page");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        System.out.println("Enter username and password");
    }
    @Then("click login")
    public void click_login() {
        System.out.println("click login");
    }
    @Then("redirect to accounts page")
    public void redirect_to_accounts_page() {
        System.out.println("redirect to accounts page");
    }


}
