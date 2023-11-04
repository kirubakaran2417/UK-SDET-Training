package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class DragandDrop {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        driver=BrowserSetup.BrowserSetup();
        driver.get("https://www.jqueryui.com");
        driver.findElement(By.linkText("Droppable")).click();
        //to switch inside a frame
        WebElement frame=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        //Actions-class which is used to perform mouse action-dragdrop,mouseover, mouseclick,Rightclick,doubleclick
        Actions action=new Actions(driver);
        action.click(source).build().perform();
        //action.dragAndDrop(source, target).build().perform();

    }
}
