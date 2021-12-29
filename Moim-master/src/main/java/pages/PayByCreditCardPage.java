package pages;

import io.appium.java_client.android.AndroidDriver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayByCreditCardPage extends BasePage {

    public PayByCreditCardPage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.tmob.AveaOIM.uat:id/et_phone_number")
    public WebElement phoneNumberLbl;
    @FindBy(xpath = "//android.widget.EditText[@text='Güvenlik Kodu']")
    public WebElement securityCodeLbl;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/bt_buy")
    public WebElement devamBtn;
    @FindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='YURTİÇİ PAKETLER']")
    public WebElement yurtIciPaketlerBtn;
    @FindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='YURTDIŞI PAKETLER']")
    public WebElement yurtDisiPaketlerBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Her Şey Dahil Paketler']")
    public WebElement herSeyDahilBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='İnternet Paketleri']")
    public WebElement internetPaketleriBtn;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    public WebElement birinciPaket;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/package_terms_check")
    public WebElement obfCheckBox;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/package_buy")
    public WebElement satinAlBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_number")
    public WebElement cardNumber;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_cvv")
    public WebElement cardCVV;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/input_card_expiration")
    public WebElement cardExpiration;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/btn_pay_now")
    public WebElement odemeYapBtn;
    @FindBy(id = "com.tmob.AveaOIM.uat:id/tv_positive")
    public WebElement popOpOnayBtn;


    public void writeNumberAndCode(String number) throws InterruptedException {
        writeText(phoneNumberLbl, number);
        click(securityCodeLbl);
        writeText(securityCodeLbl,"abc123");
    }

    public void clickDevamBtn() throws InterruptedException {
        click(devamBtn);
    }

    public void clickHerSeyDahil() throws InterruptedException {
        click(herSeyDahilBtn);
    }
    public void clickBirinciPaket() throws InterruptedException {
        click(birinciPaket);
    }

    public void clickCheckBox() throws InterruptedException {
        click(obfCheckBox);
    }
    public void clickSatinAlBtn() throws InterruptedException {
        click(satinAlBtn);
    }
    public void clickOdemeYap() throws InterruptedException {
        click(odemeYapBtn);
    }

    public void writeCardNumber(String number) throws InterruptedException {
        writeText(cardNumber, number);
    }
    public void writeCardCVV() throws InterruptedException {
        writeText(cardCVV, "000");
    }

    public void clickCardExp() throws InterruptedException {
        click(cardExpiration);
    }
    public void clickPopUpOnay() throws InterruptedException {
        click(popOpOnayBtn);
    }

    public void selectMonthYear() throws InterruptedException {
        scrollAndClick("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"12\").instance(0))");
        scrollAndClick("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().textContains(\"2026\").instance(0))");
    }
}
