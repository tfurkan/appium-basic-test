package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BasePage {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public BasePage(AndroidDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void click (WebElement clickElement) throws InterruptedException
    {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
//        Thread.sleep(1000);
        clickElement.click();
    }

    public void clickWithoutWait (WebElement clickElement) throws InterruptedException
    {
        Thread.sleep(5000);
        clickElement.click();
    }

    public void writeText (WebElement sendKeysElement, String text) throws  InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(sendKeysElement));
//        Thread.sleep(1000);
        sendKeysElement.sendKeys(text);
    }
    public void writeTextBeforeClear (WebElement sendKeysElement, String text) throws  InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(sendKeysElement));
        sendKeysElement.clear();
//        Thread.sleep(1000);
        sendKeysElement.sendKeys(text);
    }

    public String readText(WebElement getTextElement) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(getTextElement));
//        Thread.sleep(1000);
        return  getTextElement.getText();
    }

    public boolean assertTrueEnabled(WebElement assertionElement) throws InterruptedException {
        Thread.sleep(1000);
        return assertionElement.isEnabled();
    }

    public void tapCoordinates(int x, int y) throws InterruptedException {
        TouchAction touchAction=new TouchAction(driver);

        Thread.sleep(500);
        touchAction.tap(PointOption.point(x,y)).perform();

    }

    public void scrollAndClick(String elementAutomator) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElementByAndroidUIAutomator(elementAutomator).click();
    }

    public void assertText(WebElement actual, String expectedText){
//        SoftAssert softAssert = new SoftAssert();
//            softAssert.assertEquals(actual.getText(), expectedText);
            wait.until(ExpectedConditions.visibilityOf(actual));
            Assert.assertEquals(actual.getText(), expectedText);


    }


}
