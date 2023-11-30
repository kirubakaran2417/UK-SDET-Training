package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelUtility;

import java.io.IOException;

public class Temp {
    String[][] data;
    @Test(dataProvider = "temp")
    public void test(String username, String password) {
        System.out.println(username);
        System.out.println(password);

    }
    @DataProvider(name = "temp")
    public String[][] dataProvider() throws IOException {
        data= ExcelUtility.getExcelData();
        return data;
    }
}
