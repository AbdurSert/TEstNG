package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.util.Set;

public class AmazonTest extends TestBase{


@Test

    public void amazon() throws InterruptedException {

    Driver.getDriver().get("https://www.amazon.com/");
    WebElement signIn = Driver.getDriver().findElement(By.id("nav-link-accountList"));
    actions.moveToElement(signIn).perform();
    Driver.wait(2);
    WebElement recommandations = Driver.getDriver().findElement(By.xpath("//span[(text()= 'Recommendations')]"));
    recommandations.click();
    Driver.wait(2);

    WebElement topPicks = Driver.getDriver().findElement(By.cssSelector("h2[class= 'a-size-large a-spacing-base']"));
    String text = topPicks.getText();


    ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https://www.ebay.com/', '_blank');");
    Driver.wait(2);

    Set<String> handles = Driver.getDriver().getWindowHandles();
    Driver.getDriver().switchTo().window(handles.toArray()[1].toString());

    WebElement searchBox = Driver.getDriver().findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input']"));
    searchBox.sendKeys(text + Keys.ENTER);
    Driver.wait(2);


    WebElement price = Driver.getDriver().findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/div[2]/div[1]/span"));
    String expectedPrice = "1.25";
    String actualPrice = price.getText();
    System.out.println(actualPrice);

    Assert.assertTrue(actualPrice.contains(expectedPrice));



}


}
