package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerUtils extends TestListenerAdapter {
    public static ExtentReports extent;
    public static ExtentTest logger;
    public void onStart(ITestContext context) {
       extent=ExtentReportManager.getInstance();
    }
    public void onTestSuccess(ITestResult result) {
        logger = extent.createTest(result.getName());
        logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
        logger.log(Status.PASS, result.getThrowable());
    }
    public void onTestFailure(ITestResult result) {
        logger = extent.createTest(result.getName());
        logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
        logger.log(Status.FAIL, result.getThrowable());
    }
    public void onTestSkipped(ITestResult result) {
        logger = extent.createTest(result.getName());
        logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
        logger.log(Status.SKIP, result.getThrowable());
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }

    }

