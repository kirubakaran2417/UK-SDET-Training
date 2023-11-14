package testcases;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
    @DataProvider(name = "logindetails")
    public String[][] data(){
        String [][] testdata={
                {"lokesh","loki123"},
                {"sowmya","sowmya123"},
                {"femi","femi123"},
        };
        return testdata;
    }

}
