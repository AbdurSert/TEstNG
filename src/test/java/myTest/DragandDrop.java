package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragandDropPage;
import utilities.AllPages;
import utilities.Driver;
import utilities.TestBase;

public class DragandDrop extends TestBase {

 public AllPages allPages = new AllPages();


 @Test

    public void dragAndDrop(){

     Driver.getDriver().switchTo().frame(allPages.dragandDropPage.iFrameCookies);
     actions.click(allPages.dragandDropPage.acceptAll).perform();

     actions.dragAndDrop(allPages.dragandDropPage.bankButton, allPages.dragandDropPage.accountofDebit).build().perform();
     actions.dragAndDrop(allPages.dragandDropPage.salesButton, allPages.dragandDropPage.accountOfCredit).build().perform();
     actions.dragAndDrop(allPages.dragandDropPage.first5000, allPages.dragandDropPage.amountOfDebit).build().perform();
     actions.dragAndDrop(allPages.dragandDropPage.second5000, allPages.dragandDropPage.amountOfCredit).build().perform();

     String actuallAmountOfDebit = allPages.dragandDropPage.amountOfDebit.getText();
     String expectedAmountOfDebit = "5000";

     String actuallAmountOfCredit = allPages.dragandDropPage.amountOfCredit.getText();
     String expectedAmountOfCredit = "5000";

     softAssert.assertEquals(actuallAmountOfDebit, expectedAmountOfDebit, "AmountOfDebitTest Failed");
     softAssert.assertEquals(actuallAmountOfCredit, expectedAmountOfCredit, "AmountOfCreditTest Failed");
     softAssert.assertAll();

     String actuallTextOfEnd = allPages.dragandDropPage.perfectText.getText();
     String expectedTextOfEnd = "Perfect!";

     Assert.assertEquals(actuallTextOfEnd, expectedTextOfEnd);

 }

}
