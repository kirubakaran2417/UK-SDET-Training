package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Locators {
   static WebDriver driver;
    public static void main(String[] args) {
        //in selenium we are having 7 locators
        /*
         * 1. id
         * 2. name
         * 3. classname
         * 4. xpath
         * 5. css selector
         * 6. link text
         * 7. partial link text
         */
        //click,type,clear,scroll,drop down
        driver=BrowserSetup.BrowserSetup();
        driver.get("https://www.mycontactform.com");
        WebElement sampleforms=driver.findElement(By.linkText("Sample Forms"));
        sampleforms.click();
        driver.findElement(By.xpath("//input[@type='checkbox'][@value='1']")).click();
        driver.findElement(By.id("subject")).sendKeys("lokesh");
        WebElement dropdown=driver.findElement(By.id("q3"));
        //select-is a class which is used to handle drop downs
        Select select=new Select(dropdown);
        select.selectByVisibleText("Third Option");
        driver.findElement(By.xpath("//input[@value='Third Option']")).click();

        List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox size is "+checkbox.size());
    }
}
