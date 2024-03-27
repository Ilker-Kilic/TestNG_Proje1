package US_406;

import US_405.TC405_406_Elments;
import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_406_negativeTesting extends BaseDriver {
    @Test
    @Parameters("searchText")
    public void Test406Negative(String searchID){

        TC405_406_Elments elments=new TC405_406_Elments();

        LoginTest();
        elments.findrecord.click();

        elments.find.sendKeys(searchID+ Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfAllElements(elments.Records));

        Assert.assertTrue(elments.NoneMatch.isDisplayed());

    }
}
