package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExcelTrainingPage {

    public ExcelTrainingPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "accept-cookie-notification")
    public WebElement cookie;

    @FindBy(id = "user_full_name")
    public WebElement usernameBox;

    @FindBy (id = "user_email_login")
    public WebElement emailBox;

    @FindBy (id = "user_password")
    public WebElement password;

    @FindBy (id = "tnc_checkbox")
    public WebElement checkBox;

    @FindBy (css = "div[class= 'error-msg show']")
    public WebElement EmailErrorMessage;

    @FindBy (css = "div[class='error-msg show']")
    public WebElement passwordErrorMessage;

    @FindBy (id = "user_submit")
    public WebElement signButton;

    @FindBy (xpath = "//h2[contains(text(), 'Check your email' )]")
    public WebElement validationMessage;

}
