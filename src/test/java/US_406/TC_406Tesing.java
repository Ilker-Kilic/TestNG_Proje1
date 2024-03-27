package US_406;

import US_405.TC405_406_Elments;
import Utility.BaseDriver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_406Tesing extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void Test406(String searchID){

        TC405_406_Elments elments=new TC405_406_Elments();

        LoginTest();
        elments.findrecord.click();

        elments.find.sendKeys(searchID);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", elments.records100Jan);

        Assert.assertTrue(elments.records100janDocument.isDisplayed());



    }

}
