package myTest;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablePage;
import utilities.Driver;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableTest extends TestBase {

    TablePage tablePage = new TablePage();

   @Test

    public void tableTest1()  {

        String actuallText = tablePage.firstTable.getText();
        String expectedText = "http://www.timconway.com";

        Assert.assertEquals(actuallText, expectedText);

    }

    @Test

    public void tableTest2()  {

       String firstTitles = tablePage.secondTable.getText();
       String secondTitles= tablePage.thirdTable.getText();

       Assert.assertEquals(firstTitles, secondTitles);

    }
    @Test

    public void tableTest3(){

        String actuallAmount =tablePage.fourthTable.getText();
        String expectedAmount = "$100.00";

        Assert.assertEquals(actuallAmount, expectedAmount);

    }


}
