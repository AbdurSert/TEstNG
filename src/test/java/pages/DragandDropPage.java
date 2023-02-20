package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DragandDropPage {

    public DragandDropPage() {PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(id = "gdpr-consent-notice")
    public WebElement iFrameCookies;

    @FindBy(xpath = "//span[text()= 'Accept All']")
    public WebElement acceptAll;

    @FindBy(xpath = "//a[text()=' BANK ']")
    public WebElement bankButton;

    @FindBy(css = "ol[class='field14 ui-droppable ui-sortable']")
    public WebElement accountofDebit;

    @FindBy(xpath = "//a[text()=' SALES ']")
    public WebElement salesButton;

    @FindBy(css = "ol[class='field15 ui-droppable ui-sortable']")
    public WebElement accountOfCredit;

    @FindBy(xpath = "/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a")
    public WebElement first5000;

    @FindBy(css = "ol[class='field13 ui-droppable ui-sortable']")
    public WebElement amountOfDebit;

    @FindBy(xpath = "/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a")
    public WebElement second5000 ;

    @FindBy(id = "amt8")
    public WebElement amountOfCredit;

    @FindBy(xpath = "//a[text()='Perfect!']")
    public WebElement perfectText;


}
