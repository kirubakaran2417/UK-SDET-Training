package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
    static WebDriver driver;
    public static WebDriver BrowserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
