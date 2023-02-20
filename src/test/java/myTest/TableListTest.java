package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TableListTest extends TestBase {

    public double amounts(int row){

    String amount = Driver.getDriver().findElement(By.xpath("//table//tbody//tr[" + row + "]//td[4]")).getText().substring(1);

    double doubleAmount = Double.parseDouble(amount);

    return doubleAmount;

    }

    List<Double> listOfAmounts = new ArrayList<Double>();
    List<Double> listOfGreaterThan50 = new ArrayList<Double>();

    @Test
    public void AmountList(){

        for(int i= 1; i<= 4; i++){

            if(amounts(i) > 50.00){

                listOfGreaterThan50.add(amounts(i));
            }

            else{

            listOfAmounts.add(amounts(i));}
        }

        double expectedValue = 100.00;
        Assert.assertTrue(listOfGreaterThan50.contains(expectedValue));

    }

}
