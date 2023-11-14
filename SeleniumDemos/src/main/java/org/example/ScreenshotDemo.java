package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {

        static WebDriver driver;
        public static void main(String[] args) throws IOException {

            driver=BrowserSetup.browserSetup();
            driver.get("https://www.mycontactform.com");
            WebElement sampleforms=driver.findElement(By.linkText("Sample Forms"));
            //Take screenshot
            TakesScreenshot ts= (TakesScreenshot) driver;
            File screenshot=ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("D:\\Workspaces\\UK-SDET\\SeleniumDemos\\Screenshots\\screenshot.png"));
    }
}
