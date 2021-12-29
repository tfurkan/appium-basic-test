package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdemelerPage extends BasePage{
    public OdemelerPage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    //****************** WEB ELEMENTS ****************
    @FindBy(xpath = "//android.widget.TextView[@text='TL Yükleme']")
    public WebElement tlYuklemeBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/button_pay")
    public WebElement devamBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_phone_number")
    public WebElement telNo;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    public WebElement tlBarem;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/card_entry_label")
    public WebElement baskaKrediKarti;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_number")
    public WebElement cardNumber;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_cvv")
    public WebElement cardCVV;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_expiration")
    public WebElement cardSonKullanim;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/agreement_check")
    public WebElement onayCheck;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/btn_pay_now")
    public WebElement btnOdemeYap;
    @FindBy (xpath = "//android.widget.EditText[@text='']")
    public WebElement webViewLabel;
    @FindBy(id = "submitbutton")
    public WebElement gonderBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_msg")
    public WebElement basariliTlMesaji;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_positive")
    public WebElement tamamBtn;


    //************* PAGE METHODS ***************

    //************* Click Methods ***************
    public void clickTlYuklemeBtn() throws InterruptedException {
        click(tlYuklemeBtn);
    }
    public void clickDevamBtn() throws InterruptedException {
        click(devamBtn);
    }
    public void selectBarem() throws InterruptedException {
        click(tlBarem);
    }
    public void clickBaskaKart() throws InterruptedException {
        click(baskaKrediKarti);
    }
    public void clickCardSonKullanim() throws InterruptedException {
        click(cardSonKullanim);
    }
    public void clickSozlesmeCheckBox() throws InterruptedException {
        click(onayCheck);
    }
    public void clickOdemeYapBtn() throws InterruptedException {
        click(btnOdemeYap);
    }
    public void clickGonderBtn() throws InterruptedException {
        click(gonderBtn);
    }

    //*********** Write Methods ***************
    public void writeYuklenecekTelNo(String text) throws InterruptedException {
        writeTextBeforeClear(telNo, text);
    }
    public void writeCardNumber(String number) throws InterruptedException {
        writeText(cardNumber, number);
    }
    public void writeCardCVV() throws InterruptedException {
        writeText(cardCVV, "000");
    }
    public void writeSecureCode(String text) throws InterruptedException {
        writeTextBeforeClear(telNo, text);
    }
    public void clickTamamBtn() throws InterruptedException {
        click(tamamBtn);
    }

    //************ Assertion Methods *************
    public void assertBasariliTlYukleme(String expectedText) throws InterruptedException {
        assertText(basariliTlMesaji, expectedText);
    }


    public void selectMonthYear() throws InterruptedException {
        scrollAndClick("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"12\").instance(0))");
        scrollAndClick("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"2026\").instance(0))");
    }


}
