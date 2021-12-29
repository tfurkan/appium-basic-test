package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TC01_MobilLoginTests extends BaseTest {

    LoginPage loginPage;

    @Test (priority = 0)
    public void successLogin () throws InterruptedException {
        loginPage = new LoginPage(driver, wait);

        ExtentTest report = extent.createTest("Başarılı Login", "");
        report.log(Status.INFO, "Uygulama Açıldı");

        try{
            loginPage.clickLoginBtn();
            report.log(Status.PASS,"Başlangıç giriş yap butonuna basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Başlangıç giriş yap butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }

        try{
            loginPage.writeMsisdnSifre("5012636424", "123456");
            report.log(Status.PASS,"Tel no ve şifre yazıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Tel no ve şifre yazılamadı");
            report.fail(e);
            extent.flush();
        }

        try{
            loginPage.clickLoginBtn();
            report.log(Status.PASS,"Giriş yap butonuna basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Giriş yap butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }
        loginPage.clickNegativeBtn();
        loginPage.clickNegativeBtn();
        try{
            loginPage.clickImage();
            loginPage.clickImage();
            loginPage.clickImage();
            report.log(Status.PASS,"Ekrana 3 kere tıklama yapıldı.");

        }catch (Exception e){
            report.log(Status.FAIL,"Ekrana 3 kere tıklama yapılamadı.");
            report.fail(e);
            extent.flush();

        }
        loginPage.clickGiftIcon();
        try{
            loginPage.assertHomePage();
            report.log(Status.PASS,"Login olunduğu görüldü.");


        }catch (Exception e){
            report.log(Status.FAIL,"Login olunduğu görülemedi.");
            report.fail(e);
            extent.flush();
        }

    }

    @Test (priority = 1)
    public void loginWithOneMethod(){
        loginPage = new LoginPage(driver, wait);
        ExtentTest report = extent.createTest("Tek Method Başarılı Login", "");
        report.log(Status.INFO, "Uygulama Açıldı");
        try{
            loginPage.loginMethod("5012636425", "123456");
            report.log(Status.PASS,"Login olundu");


        }catch (Exception e){
            report.log(Status.FAIL,"Login olunamadı");
            report.fail(e);
            extent.flush();
        }
    }

    @Test (priority = 2)
    public void failLogin(){
        loginPage = new LoginPage(driver, wait);
        ExtentTest report = extent.createTest("Başarısız Login", "");
        report.log(Status.INFO, "Uygulama Açıldı");

        try{
            loginPage.clickLoginBtn();
            report.log(Status.PASS,"Başlangıç giriş yap butonuna basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Başlangıç giriş yap butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }

        try{
            loginPage.writeMsisdnSifre("5555555555", "555555");
            report.log(Status.PASS,"Tel no ve şifre yazıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Tel no ve şifre yazılamadı");
            report.fail(e);
            extent.flush();
        }

        try{
            loginPage.clickLoginBtn();
            report.log(Status.PASS,"Giriş yap butonuna basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Giriş yap butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }

        try {
            loginPage.assertFailLoginText("Lütfen girmiş olduğunuz bilgileri kontrol ederek tekrar deneyiniz.123");
            report.log(Status.PASS,"Uyarı popup'ı görüldü");

        }catch (Exception e){
            report.log(Status.FAIL,"Uyarı popup'ı görülemedi.");
            report.fail(e);
            extent.flush();
            Assert.fail();

        }

        try{
            loginPage.clickTamamBtn();
            report.log(Status.PASS,"Tamam butonuna basıldı.");


        }catch (Exception e){
            report.log(Status.FAIL,"Tamam butonuna basılamadı.");
            report.fail(e);
            extent.flush();
        }
        try{
            loginPage.assertLoginSayfasi();
            report.log(Status.PASS,"Login sayfasına dönüldüğü görüldü.");


        }catch (Exception e){
            report.log(Status.FAIL,"Login sayfasına dönüldüğü görülemedi");
            report.fail(e);
            extent.flush();
        }

    }

}
