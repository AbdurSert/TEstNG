package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframePageW3;
import pages.TablePage;
import utilities.Driver;
import utilities.TestBase;

import java.time.Duration;

public class Iframe extends TestBase {

    IframePageW3 iframePageW3 = new IframePageW3();

    @Test

    public void iFrameTest() throws InterruptedException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        Driver.getDriver().switchTo().frame("mce_0_ifr");

        WebElement textDoc = Driver.getDriver().findElement(By.id("tinymce"));
        textDoc.clear();
        textDoc.sendKeys("ADam");

        Driver.getDriver().switchTo().parentFrame();
        WebElement boldButton = Driver.getDriver().findElement(By.cssSelector("button[aria-label = 'Bold']"));
        boldButton.click();
        Driver.wait(2);

    }

    @Test
    public void iframeTest() throws InterruptedException {

        Driver.getDriver().get("https://www.w3schools.com/html/html_iframe.asp");

        WebElement cokkies1 = Driver.getDriver().findElement(By.id("accept-choices"));
        cokkies1.click();


        Driver.getDriver().switchTo().frame(iframePageW3.iframeId);
        WebElement cokkies2 = Driver.getDriver().findElement(By.id("accept-choices"));
        cokkies2.click();

        iframePageW3.nextButton.click();

    }
}
