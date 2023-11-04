package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserConfiguration {

    public static void main(String[] args) {
        //to open chrome browser
        WebDriver driver=new ChromeDriver();
        //to open edge browser
        WebDriver driver2=new EdgeDriver();
        driver.manage().window().maximize();
        //to open any web page
        driver.get("https://www.google.com");
        //webdriver methods
        System.out.println(driver.getTitle());//print title of the page
        System.out.println(driver.getCurrentUrl());//print current url

        driver.navigate().to("http://facebook.com");
        //browser options
        driver.manage().window().fullscreen();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //to quit browser
        driver.quit();
        //to close browser
        driver.close();
    }
}
