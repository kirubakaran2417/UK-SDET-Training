package testcases;

import base.baseclass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageFactory.InventoryPage;
import pageFactory.SigninPage;
import utilities.ExcelUtility;

import java.io.IOException;
import java.sql.SQLOutput;

@Listeners(utilities.ListenerUtils.class)
public class RegressionTestcase extends baseclass {

    static String data[][];
    @Test
    public void testSignInandSignOut(){

        SigninPage signinpage=gotoHomepage();

        InventoryPage inventorypage=signinpage
                .enterUserName("standard_user")
                .enterPassword("secret_sauce")
                .gotoInventoryPage();

    }

    @DataProvider
    public String[][] dataProvider() throws IOException {
        data= ExcelUtility.getExcelData();
        return data;
    }
}
