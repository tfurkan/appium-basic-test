package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReporterClass {

    static ExtentHtmlReporter htmlReporter;
    static String REPORT_PATH;

    public static ExtentReports reportCase(ExtentReports extent){
        String fileName = System.getProperty("user.home") + System.getProperty("file.separator") + "Properties" + System.getProperty("file.separator") + "app.properties";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
            REPORT_PATH = prop.getProperty("REPORT_PATH");
        } catch (
                IOException ex) {
            System.exit(1);
        }
        htmlReporter = new ExtentHtmlReporter(REPORT_PATH + System.getProperty("file.separator") + "Cicek.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "Android");
        extent.setSystemInfo("Environment", "Mobile Testing ");
        extent.setSystemInfo("User Name", "Taha Furkan AYDOĞMUŞ");
        htmlReporter.config().setDocumentTitle("MOIM Login");
        htmlReporter.config().setReportName("MOIM_Login");
        htmlReporter.config().setTheme(Theme.STANDARD);
        return extent;
    }
}
