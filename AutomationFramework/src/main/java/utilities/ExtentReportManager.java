package utilities;

import base.DriverUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

public class ExtentReportManager extends DriverUtils {
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;

    /**
     * Instantiates a new Driver utils.
     *
     * @param driver the driver
     */
    public ExtentReportManager(WebDriver driver) {
        super(driver);
    }

    public static ExtentReports getInstance() {
        extent = new  ExtentReports();
        String repName = "TestReport-"+System.currentTimeMillis()+".html";
        String projectpath = System.getProperty("user.dir");
        spark = new ExtentSparkReporter(projectpath+"\\TestOutput\\"+repName);
        extent.attachReporter(spark);
        spark.config().setReportName("Web Automation Results");
        spark.config().setDocumentTitle("Test Results");
        spark.config().setTheme(Theme.DARK);
        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        return extent;
    }
}
