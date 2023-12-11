package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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


    @When("Enter {string} and {string}")
    public void enterUsernameAndPassword(String username, String password) {
        System.out.println("Enter " + username + " and " + password);

    }

    @And("redirect to login page")
    public void redirectToLoginPage() {
        System.out.println("redirect to login page");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials(DataTable dataTable) {
        System.out.println("user entered valid credentials");
        List<Map<String, String>> credentials =
                dataTable.asMaps(String.class, String.class);
        String username = credentials.get(0).get("username");
        System.out.println(username);
        String password = credentials.get(0).get("password");
        System.out.println(password);
    }
}
