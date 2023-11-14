package testcases;
import org.example.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SampleformsTestcase {
   static WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
         driver = BrowserSetup.browserSetup();
        driver.get("https://www.mycontactform.com/samples.php");
        driver.manage().window().maximize();
    }
    //groups
    @Test(priority = 1,groups = "regression")
    public void subject() {
        WebElement subject = driver.findElement(By.id("subject"));
        Assert.assertTrue(subject.isDisplayed());
        subject.sendKeys("Test");
    }
    @Test(priority = 2,groups = "regression")
    public void email() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("lokeshpandian@gmail.com");
    }
    @Test(priority = 3,groups = "smoke")
    public void message () {
        WebElement message = driver.findElement(By.id("q1"));
        message.sendKeys("lONDON");
    }
    @Test(priority = 4,groups = {"smoke","regression"})
    public void message1 () {
        WebElement message1 = driver.findElement(By.id("q2"));
        message1.sendKeys("UK");
    }
        @AfterTest(alwaysRun = true)
        public void afterTest() {
            driver.quit();
        }
}
