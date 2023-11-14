package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationdemo
{
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }
    @Test
    public void testcase1()
    {
        System.out.println("This is testcase1");
    }
    @Test
    public void testcase2(){
        System.out.println("This is testcase2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }
}
