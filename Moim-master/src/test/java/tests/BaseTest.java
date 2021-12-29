package tests;

import com.aventstack.extentreports.ExtentReports;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import report.ReporterClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver driver ;
    static ExtentReports extent;
    public ReporterClass objReport;
    public WebDriverWait wait;

    @BeforeClass
    public void beforeClass(){
        extent = objReport.reportCase(extent);
    }

    @BeforeMethod
    public void setUp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("VERSION", "10");
        capabilities.setCapability("deviceName", "AOSP on IA Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.tmob.AveaOIM.uat");
        capabilities.setCapability("appActivity", "com.avea.oim.newlogin.splash.SplashActivity");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 20);
        Thread.sleep(7000);
    }

    @AfterMethod
    public void tearDown(){
        extent.flush();
        driver.quit();

    }

}
