package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AlertHandling {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        driver=BrowserSetup.BrowserSetup();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.findElement(By.name("alertbox")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();//clicking ok
//        alert.dismiss();//clicking cancel
//        alert.sendKeys("hello");//entering text

    }
}
