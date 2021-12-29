package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    public HomePage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    //****************** WEB ELEMENTS ****************
    @FindBy(xpath = "//android.widget.TextView[@text='Ödemeler']")
    public WebElement odemelerBtn;

    //************* PAGE METHODS ***************

    //************* Click Methods ***************
    public void clickOdemelerBtn() throws InterruptedException {
       click(odemelerBtn);
    }
}
