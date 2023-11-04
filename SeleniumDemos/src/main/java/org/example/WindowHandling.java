package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        driver = BrowserSetup.BrowserSetup();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
        driver.findElement(By.xpath("//*[@id='Seperate']/button")).click();
        Set<String> windows=driver.getWindowHandles();
        List<String> windowList=new ArrayList<>(windows);
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().window(windowList.get(0));
        System.out.println(driver.getTitle());
    }
}
