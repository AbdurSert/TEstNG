package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TablePage {

    public TablePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//table[1]//tr[4]//td[5]")

    public WebElement firstTable;

    @FindBy (xpath = "//table[1]//thead//tr")

    public WebElement secondTable;

    @FindBy(xpath = "//table[2]//thead//tr")

    public WebElement thirdTable;

    @FindBy (xpath = "//table[2]//tbody//tr[3]//td[4]")

    public WebElement fourthTable;

}
