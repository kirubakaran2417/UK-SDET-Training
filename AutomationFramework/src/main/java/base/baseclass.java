package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.FileAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageFactory.SigninPage;
import utilities.FileIO;

import java.time.Duration;
import java.util.Properties;

public class baseclass {
    static Properties properties= FileIO.readPropertyFile();
    public static final String base_url =properties.getProperty("BASE_URL");
    public static WebDriver driver;
    public static final String homepagetitle="Swag Labs";

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown(){

        driver.quit();
    }

    public SigninPage gotoHomepage(){
        driver.get(base_url);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.titleIs(homepagetitle));
        Assert.assertEquals(driver.getTitle(),homepagetitle);

        return PageFactory.initElements(driver, SigninPage.class);
    }
}
