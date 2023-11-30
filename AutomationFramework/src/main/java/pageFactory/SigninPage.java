package pageFactory;

import base.DriverUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class SigninPage{

    public WebDriver driver;

    @FindBy(id = "user-name")
    public WebElement userName;  //driver.findElement(By.id("user-name"));

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;




    public SigninPage enterUserName(String username) {
       userName.sendKeys(username);

        return this;
    }
    public SigninPage enterPassword(String passWord) {
        password.sendKeys(passWord);

        return this;
    }
    public SigninPage clickSignIn() {

        loginButton.click();
        return this;
    }

    public InventoryPage gotoInventoryPage(){
        clickSignIn();

        return PageFactory.initElements(driver, InventoryPage.class);
    }

}
