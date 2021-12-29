package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.OdemelerPage;

public class TC04_OdemelerTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    OdemelerPage odemelerPage;

    @Test
    public void tlYuklemeTest(){
        loginPage = new LoginPage(driver, wait);
        homePage = new HomePage(driver,wait);
        odemelerPage = new OdemelerPage(driver,wait);

        ExtentTest report = extent.createTest("Tek Method Başarılı Login", "");
        report.log(Status.INFO, "Uygulama Açıldı");
        try{
            loginPage.loginMethod("5012636424", "123456");
            report.log(Status.PASS,"Login olundu");


        }catch (Exception e){
            report.log(Status.FAIL,"Login olunamadı");
            report.fail(e);
            extent.flush();
            Assert.fail();
//            driver.quit();
//            driver.close();
        }
        try{
            homePage.clickOdemelerBtn();
            report.log(Status.PASS,"Odemeler Butonuna Basıldı");


        }catch (Exception e){
            report.log(Status.FAIL,"Odemeler Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.clickTlYuklemeBtn();
            report.log(Status.PASS,"Tl Yükleme Butonuna Basıldı");


        }catch (Exception e){
            report.log(Status.FAIL,"Tl Yuklemeye Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.writeYuklenecekTelNo("5012636500");
            report.log(Status.PASS,"Yükleme Yapılacak Numara Girildi");


        }catch (Exception e){
            report.log(Status.FAIL,"Yükleme Yapılacak Numara Girilemedi");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.clickDevamBtn();
            report.log(Status.PASS,"Devam Butonuna Basıldı");


        }catch (Exception e){
            report.log(Status.FAIL,"Devam Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.selectBarem();
            report.log(Status.PASS,"Tl Baremi Seçildi");


        }catch (Exception e){
            report.log(Status.FAIL,"TL Baremi Seçilemedi");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.clickDevamBtn();
            report.log(Status.PASS,"Şimdi Öde Butonuna Basıldı");


        }catch (Exception e){
            report.log(Status.FAIL,"Şimdi Öde Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            odemelerPage.clickBaskaKart();
            report.log(Status.PASS,"Baska Kredi Kartıyla Öde'ye basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Baska Kredi Kartıyla Öde'ye Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.writeCardNumber("5892837560410909");
            report.log(Status.PASS, "Kredi Kartı Numarası Yazıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Kredi Kartı Numarası Yazılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.writeCardCVV();
            report.log(Status.PASS, "CVV kodu yazıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "CVV kodu yazılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.clickCardSonKullanim();
            report.log(Status.PASS, "Son Kullanma Tarihine Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Son Kullanma Tarihine Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.selectMonthYear();
            report.log(Status.PASS, "Kart Ay ve Yıl seçildi.");
//            Thread.sleep(10000);


        } catch (Exception e) {
            report.log(Status.FAIL, "Kart Ay ve Yıl Seçilemedi");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.clickSozlesmeCheckBox();
            report.log(Status.PASS, "Sözleşme İşaretlendi");


        } catch (Exception e) {
            report.log(Status.FAIL, "Sözleşme İşaretlenemedi");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.clickOdemeYapBtn();
            report.log(Status.PASS, "Ödeme Yap Butonuna Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Ödeme Yap Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.writeSecureCode("a");
            report.log(Status.PASS, "SecureCode Girildi.");


        } catch (Exception e) {
            report.log(Status.FAIL, "Secure Code Girilemedi.");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.clickGonderBtn();
            report.log(Status.PASS, "Gönder Butonuna Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Gönder Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }
        try {
            odemelerPage.assertBasariliTlYukleme("Lira yükleme talebiniz alınmıştır, SMS ile bilgilendirme yapılacaktır.");
            report.log(Status.PASS, "Başarılı TL Yükleme Mesajı Görülmüştür");

        } catch (Exception e) {
            report.log(Status.FAIL, "Başarılı TL Yükleme Mesajı Görülememiştir");
            report.fail(e);
            extent.flush();
            Assert.fail();
        }
        try {
            odemelerPage.clickTamamBtn();
            report.log(Status.PASS, "Tamam Butonuna Basıldı");


        } catch (Exception e) {
            report.log(Status.FAIL, "Tamam Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }

    }
}
