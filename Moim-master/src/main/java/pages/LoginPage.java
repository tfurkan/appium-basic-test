package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    //****************** WEB ELEMENTS ****************
    @FindBy(id = "com.tmob.AveaOIM.uat:id/btn_login")
    public WebElement loginBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/et_msisdn")
    public WebElement msisdn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/et_password")
    public WebElement sifreOTP;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_msg")
    public WebElement failLoginText;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_positive")
    public WebElement tamamBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/login_layout")
    public WebElement loginLayout;
    @FindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='İnternet / Ev Telefonu / Tivibu']")
    public WebElement evdeInternetBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/et_tckn")
    public WebElement tcNoLabel;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/btn_request_otp")
    public WebElement sifreGonderBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_credit_card_packages")
    public WebElement creditCardBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/button_negative")
    public WebElement negativeBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/imageView")
    public WebElement imageView;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/gift_icon")
    public WebElement giftIcon;
    @FindBy(xpath = "//android.widget.TextView[@text='Kullanımlarım']")
    public WebElement kullanimBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Lira İşlemlerim']")
    public WebElement liraislemBtn;


    //************* PAGE METHODS ***************

    //************* Click Methods ***************
    public void clickLoginBtn() throws InterruptedException {
        click(loginBtn);
    }
    public void clickTamamBtn() throws InterruptedException {
        click(tamamBtn);
    }
    public void clickCreditCardBtn() throws InterruptedException {
        click(creditCardBtn);
    }
    public void clickEvdeInternet () throws InterruptedException {
        click(evdeInternetBtn);
    }
    public void clickSifreGonder() throws InterruptedException {
        click(sifreGonderBtn);
    }
    public void clickNegativeBtn() throws InterruptedException {
        try{
            clickWithoutWait(negativeBtn);
        }catch (Exception e){

        }
    }
    public void clickImage() throws InterruptedException {
        click(imageView);
    }
    public void clickGiftIcon() throws InterruptedException {
        try{
            clickWithoutWait(giftIcon);
        }catch (Exception e){

        }
    }

    //*********** Write Methods ***************
    public void writeMsisdnSifre(String telNo, String sifre) throws InterruptedException {
        writeText(msisdn, telNo);
        writeText(sifreOTP, sifre);
    }
    public void writeTcAndTelNo(String tc, String telNo) throws InterruptedException {
        writeText(tcNoLabel, tc);
        writeText(msisdn, telNo);
    }

    //************ Assertion Methods *************
    public void assertFailLoginText(String expectedText) throws InterruptedException {
        assertText(failLoginText, expectedText);
    }

    public void assertLoginSayfasi() throws InterruptedException {
        assertTrueEnabled(loginLayout);
    }
    public void assertHomePage() throws InterruptedException {
        assertTrueEnabled(kullanimBtn);
        assertTrueEnabled(liraislemBtn);

    }

    //************* Login için kullanılacak method *************
    public void loginMethod(String telNo, String sifre) throws InterruptedException {
        click(loginBtn);
        writeText(msisdn, telNo);
        writeText(sifreOTP, sifre);
        click(loginBtn);
        try{
            clickWithoutWait(negativeBtn);
        }catch (Exception e){

        }
        try{
            clickWithoutWait(negativeBtn);
        }catch (Exception e){

        }
        click(imageView);
        click(imageView);
        click(imageView);
        try{
            clickWithoutWait(giftIcon);
        }catch (Exception e){

        }
        assertTrueEnabled(kullanimBtn);
        assertTrueEnabled(liraislemBtn);
    }



}
