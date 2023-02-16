package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.time.Duration;

public class WaitTest extends TestBase {



    @Test

            public void waitTest() throws InterruptedException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = Driver.getDriver().findElement(By.xpath("//button[(text()='Remove')]"));
        removeButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String expectedMessage = "It's gone!";
        String actuallMessage = message.getText();
        Assert.assertEquals(actuallMessage, expectedMessage);


        WebElement addButton = Driver.getDriver().findElement(By.xpath("//button[(text()='Add')]"));
        addButton.click();
        WebElement message2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String actuallMessage2 = message2.getText();
        String expectedMessage2 = "It's back!";

        Assert.assertEquals(actuallMessage2,expectedMessage2);


    }
}
