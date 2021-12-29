package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC02_GenisbantLoginTests extends BaseTest{

    LoginPage loginPage;

    @Test
    public void evdeInternetLogin() throws Exception{

        loginPage = new LoginPage(driver, wait);

        ExtentTest report = extent.createTest("Geniş Bant Başarılı Login","successLogin");
        report.log(Status.INFO,"Uygulama Açıldı.");
        try{
            loginPage.clickLoginBtn();
            report.log(Status.PASS,"Başlangıç Giriş Yap butonuna basıldı.");

        }catch (Exception e){
            report.log(Status.FAIL,"Başlangıç Giriş Yap butonuna basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            loginPage.clickEvdeInternet();
            report.log(Status.PASS,"Evde internet sekmesine basıldı");

        }catch (Exception e){
            report.log(Status.FAIL,"Evde internet sekmesine basılamadı");
            report.fail(e);
            extent.flush();
        }
        try{
            loginPage.writeTcAndTelNo("47485458858", "5759488895");
            report.log(Status.PASS,"Tc ve Telefon Numarası Bilgileri Girildi.");

        }catch (Exception e){
            report.log(Status.FAIL,"Tc ve Telefon Numarası Bilgileri Girilemedi.");
            report.fail(e);
            extent.flush();
        }

        try{

            loginPage.clickSifreGonder();
            report.log(Status.PASS,"Şifre Gönder Butonuna Basıldı");

        }catch (Exception e){
            report.log(Status.FAIL,"Şifre Gönder Butonuna Basılamadı");
            report.fail(e);
            extent.flush();
        }

        try{
            Thread.sleep(7000);
            for (int i = 0; i<6; i++) {
                loginPage.tapCoordinates(140, 1670);
            }
            Thread.sleep(2000);
            report.log(Status.PASS,"OTP Girildi.");

        }catch (Exception e){
            report.log(Status.FAIL,"OTP Girilemedi.");
            report.fail(e);
            extent.flush();
        }


    }
}
