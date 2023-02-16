package utilities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase extends ConfigReader {

    public Actions actions = new Actions(Driver.getDriver());

    @BeforeMethod

    public void setup()  {

        Driver.getDriver().get(getProperty("projectUrl"));

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

   @AfterClass

   public void tearDown() {
        Driver.closeDriver();
    }
}
