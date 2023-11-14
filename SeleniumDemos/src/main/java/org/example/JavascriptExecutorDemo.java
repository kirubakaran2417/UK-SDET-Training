package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class JavascriptExecutorDemo {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        driver=BrowserSetup.browserSetup();
        driver.get("https://www.amazon.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('twotabsearchtextbox').value='hello'");//to enter text in textbox using jsexecutor
        js.executeScript("window.scrollBy(0,600);");//to scroll down
        //to scroll to element
        WebElement element = driver.findElement(By.xpath(""));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
}
