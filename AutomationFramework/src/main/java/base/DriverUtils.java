package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DriverUtils {
    public WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest logger;
    /**
     * Instantiates a new Driver utils.
     *
     * @param driver the driver
     */
    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * Checks if an element is present.
     *
     * @param by the locator strategy used to find the element
     * @return true if the element is present, false otherwise
     */
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    /**
     * Checks if an alert is present.
     *
     * @return true if the alert is present, false otherwise
     */
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    /**
     * Close alert and get its text string.
     *
     * @param acceptNextAlert the accept next alert
     * @return the string
     */
    public String closeAlertAndGetText(boolean acceptNextAlert) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
            alert.accept();
        } else {
            alert.dismiss();
        }
        return alertText;
    }

    /**
     * Clear and type.
     *
     * @param field the field
     * @param text  the text
     */
    public void clearAndType(WebElement field, String text) {
        field.clear();
        field.sendKeys(text);
    }

    /**
     * Gets date time stamp.
     *
     * @return the date time stamp
     */
    public String getDateTimeStamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    /**
     * Select option.
     *
     * @param driver        the driver
     * @param selectOption  the select option
     * @param selectElement the select locator
     */
    public void selectOption(WebDriver driver, String selectOption, WebElement selectElement) {

        Select dropdown = new Select(selectElement);
        dropdown.selectByVisibleText(selectOption);
    }

    /**
    * Checks if text is present.
    *
    * @param driver the driver
    * @param Text   the text
    * @return true if the text is present, false otherwise
    */
    public boolean isTextPresent(WebDriver driver, String Text) {
        try {
            return driver.findElement(By.tagName("body")).getText()
                    .contains(Text);
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    /**
     * Delay.
     *
     * @param seconds the seconds
     */
    public static void delay(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * Click at.
     *
     * @param driver   the driver
     * @param element the by method
     */
    public void clickAt(WebDriver driver, WebElement element) {

        element.click();
    }

    /**
     * Click using Actions.
     *
     * @param driver  the driver
     * @param element the element
     */
    public void clickUsingActions(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.click(element).perform();
    }

    /**
     * Js click.
     *
     * @param element the variants record
     * @param driver  the driver
     * @throws InterruptedException the interrupted exception
     */
    public void jsClick(WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    /**
     * Reduce implicit wait.
     *
     * @param driver                the driver
     * @param timeToReduceInSeconds the time to reduce in seconds
     */
    public static void reduceImplicitWait(WebDriver driver, final int timeToReduceInSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeToReduceInSeconds));
    }

    /**
     * Gets driver.
     *
     * @return the driver
     */
    public WebDriver getDriver() {
        return driver;
    }
}
