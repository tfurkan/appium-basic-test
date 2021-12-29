package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PayByCreditCardPage;

public class TC03_KrediKartiIlePaketYuklemeTest extends BaseTest {

    LoginPage loginPage;
    PayByCreditCardPage objCreditCard;
    @Test
    public void successPayment() {
        loginPage = new LoginPage(driver, wait);
        objCreditCard = new PayByCreditCardPage(driver,wait);

        ExtentTest report = extent.createTest("Kredi Kartı ile Paket Yükleme", "");
        report.log(Status.INFO, "Uygulama Açıldı");

        try {
            loginPage.clickLoginBtn();
            report.log(Status.PASS, "Başlangıç giriş yap butonuna basıldı.");


        } catch (Exception e) {
            report.log(Status.FAIL, "Başlangıç giriş yap butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }

        try {
            loginPage.clickCreditCardBtn();
            report.log(Status.PASS, "Kredi Kartı ile Paket Yükleme Butonuna basıldı.");


        } catch (Exception e) {
            report.log(Status.FAIL, "Kredi Kartı ile Paket Yükleme Butonuna basılamadı");
            report.fail(e);
            extent.flush();
        }

        try {
//            Thread.sleep(3000);
            objCreditCard.writeNumberAndCode("5012636424");
            report.log(Status.PASS, "Numara ve kod yazıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Numara ve kod yazılamadı");
            report.fail(e);
            extent.flush();
        }

        try {
            objCreditCard.clickDevamBtn();
            report.log(Status.PASS, "Devam butonuna basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Devam butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }

        try {
//            Thread.sleep(10000);
            objCreditCard.clickHerSeyDahil();
            report.log(Status.PASS, "Her Şey Dahil Paketlere Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Her Şey Dahil Paketlere Basılamadı");
            report.fail(e);
            extent.flush();
        }

        try {
            objCreditCard.clickBirinciPaket();
            report.log(Status.PASS, "Listedeki İlk Paket Seçildi");


        } catch (Exception e) {
            report.log(Status.FAIL, "Listedeki İlk Paket Seçilemedi");
            report.fail(e);
            extent.flush();
        }
        try {
            objCreditCard.clickCheckBox();
            report.log(Status.PASS, "Checkbox işaretlendi");


        } catch (Exception e) {
            report.log(Status.FAIL, "CheckBox işaretlenemedi");
            report.fail(e);
            extent.flush();
        }
        try {
            objCreditCard.clickSatinAlBtn();
            report.log(Status.PASS, "Satın Al butonuna basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Satın Al butonuna basılamadı");
            report.fail(e);
            extent.flush();
        }

        try {
            objCreditCard.writeCardNumber("5892837560410909");
            report.log(Status.PASS, "Kredi Kartı Numarası Yazıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Kredi Kartı Numarası Yazılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            objCreditCard.writeCardCVV();
            report.log(Status.PASS, "CVV kodu yazıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "CVV kodu yazılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            objCreditCard.clickCardExp();
            report.log(Status.PASS, "Son Kullanma Tarihine Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Son Kullanma Tarihine Basılamadı");
            report.fail(e);
            extent.flush();
        }

        try {
            objCreditCard.selectMonthYear();
            report.log(Status.PASS, "Kart Ay ve Yıl seçildi.");
//            Thread.sleep(10000);


        } catch (Exception e) {
            report.log(Status.FAIL, "Kart Ay ve Yıl Seçilemedi");
            report.fail(e);
            extent.flush();
        }

        try {
            objCreditCard.clickOdemeYap();
            report.log(Status.PASS, "Ödeme Yap Butonuna Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Ödeme Yap Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            objCreditCard.clickPopUpOnay();
            report.log(Status.PASS, "Onay butonuna basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Onay butonuna basılamadı");
            report.fail(e);
            extent.flush();
        }





    }
}
