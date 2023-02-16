package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IframePageW3 {

    public IframePageW3() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(css = "iframe[title='W3Schools HTML Tutorial']")

    public WebElement iframeId;

    @FindBy (xpath = "//a[text()='Next ❯']")

    public WebElement nextButton;


}
