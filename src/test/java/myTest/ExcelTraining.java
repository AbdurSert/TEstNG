package myTest;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelTraining extends TestBase {

    AllPages allPages = new AllPages();

    String path = "src/main/resources/UserInfo/UserInfo .xlsx";
    FileInputStream fis = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fis);

    public ExcelTraining() throws IOException {
    }

    @Test

    public void test1() {

        actions.click(allPages.excelTrainingPage.cookie).perform();

        String username = workbook.getSheet("Sheet1").getRow(3).getCell(0).toString();

        actions.sendKeys(allPages.excelTrainingPage.usernameBox, username).perform();

        String email = workbook.getSheet("sheet4").getRow(2).getCell(0).toString();

        actions.sendKeys(allPages.excelTrainingPage.emailBox, email).perform();

        actions.click(allPages.excelTrainingPage.password).perform();

        String ActuallMailErrorMessage = allPages.excelTrainingPage.EmailErrorMessage.getText();
        String ExpectedMailErrorMessage = "Invalid Characters";

        Assert.assertEquals(ActuallMailErrorMessage, ExpectedMailErrorMessage);

    }

    @Test

    public void test2(){

        actions.click(allPages.excelTrainingPage.cookie).perform();

        String username = workbook.getSheet("Sheet1").getRow(3).getCell(0).toString();

        actions.sendKeys(allPages.excelTrainingPage.usernameBox, username).perform();

        String email = workbook.getSheet("sheet4").getRow(2).getCell(1).toString();

        actions.sendKeys(allPages.excelTrainingPage.emailBox, email).perform();

        String password = workbook.getSheet("Sheet1").getRow(3).getCell(1).toString();

        actions.sendKeys(allPages.excelTrainingPage.password, password).perform();
        actions.click(allPages.excelTrainingPage.checkBox).perform();

        String ActuallPasswordErrorMessage = allPages.excelTrainingPage.passwordErrorMessage.getText();
        String ExpectedPasswordErrorMessage = "At least 6 characters";

        Assert.assertEquals(ActuallPasswordErrorMessage, ExpectedPasswordErrorMessage);

    }

    @Test
    public void test3(){

        actions.click(allPages.excelTrainingPage.cookie).perform();

        String username = workbook.getSheet("Sheet1").getRow(3).getCell(0).toString();

        actions.sendKeys(allPages.excelTrainingPage.usernameBox, username).perform();

        String email = workbook.getSheet("sheet4").getRow(2).getCell(1).toString();

        actions.sendKeys(allPages.excelTrainingPage.emailBox, email).perform();

        String password = workbook.getSheet("Sheet1").getRow(4).getCell(1).toString();

        actions.sendKeys(allPages.excelTrainingPage.password, password);
        actions.click(allPages.excelTrainingPage.checkBox).perform();
        actions.click(allPages.excelTrainingPage.signButton).perform();

        String ActuallValidationMessage= allPages.excelTrainingPage.validationMessage.getText();
        String ExpectedValidationMessage= "Check your email";

        Assert.assertTrue(ActuallValidationMessage.contains(ExpectedValidationMessage));

    }

}
