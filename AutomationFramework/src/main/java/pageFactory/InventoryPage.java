package pageFactory;

import base.DriverUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    public WebDriver driver;
    public static ExtentTest logger;

    @FindBy(className = "product_sort_container")
    public WebElement sort;

    @FindBy(xpath = "(//button[@id='add-to-cart-sauce-labs-backpack'])[1]")
    public WebElement addToCart;

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCart;

    public InventoryPage clickSort() {
        new DriverUtils(driver).selectOption(driver, "Name (A to Z)",this.sort);
        logger.log(Status.INFO, "Clicked on sort");
        return this;
    }
    public InventoryPage clickAddToCart() {
        new DriverUtils(driver).clickAt(driver, this.addToCart);
        return this;
    }

    public CartPage clickShoppingCart() {
        new DriverUtils(driver).clickAt(driver, this.shoppingCart);
        return PageFactory.initElements(driver, CartPage.class);
    }
}
