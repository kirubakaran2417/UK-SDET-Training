package testcases;

import org.example.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestcase {
WebDriver driver;
//before and after test= run before after all test methods
    //before and after method= run before and after each test method
    @BeforeTest
    public void beforeTest(){
        driver= BrowserSetup.browserSetup();
        driver.get("https://www.mycontactform.com");
    }
    @Test(priority = 1)
    public void b(){
        WebElement username=driver.findElement(By.id("user"));
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("test");
    }
    @Test(dependsOnMethods = "b")
    public void a(){
        WebElement passsw=driver.findElement(By.id("pass"));
        Assert.assertTrue(passsw.isDisplayed());
        passsw.sendKeys("test");
    }
    @Test(dependsOnMethods ="a")
    public void c(){
        WebElement submit=driver.findElement(By.name("btnSubmit"));
        Assert.assertTrue(submit.isDisplayed());
        submit.click();
        Assert.assertEquals("https://www.mycontactform.com/",driver.getCurrentUrl());
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
