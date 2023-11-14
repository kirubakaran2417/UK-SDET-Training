package testcases;

import org.testng.annotations.Test;

public class SampleDemo {

//    @beforetest
//    public void beforetest(){
//        //open the browser
//    }
    @Test(dataProvider = "logindetails", dataProviderClass = DataProviderDemo.class)
    public void testcase1(String uname,String pwd){
        System.out.println(uname);
        System.out.println(pwd);
//        driver.findElement(By.id("username")).sendKeys(uname);
//        driver.findElement(By.id("password")).sendKeys(pwd);
//        driver.findElement(By.id("Login")).click();
//    }

    // @aftertest
    // public void aftertest(){
    //     //close the browser
//    }
}
