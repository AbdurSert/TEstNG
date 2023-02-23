package utilities;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

public class TestBase extends ConfigReader {

    public Actions actions = new Actions(Driver.getDriver());
    public SoftAssert softAssert = new SoftAssert();




    @BeforeMethod

    public void setup()  {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Driver.getDriver().get(getProperty("projectUrl"));


    }

   @AfterMethod

   public void tearDown() {
        Driver.closeDriver();
    }
}
