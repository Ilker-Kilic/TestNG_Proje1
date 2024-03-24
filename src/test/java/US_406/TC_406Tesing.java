package US_406;

import US_405.TC405_406_Elments;
import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_406Tesing extends BaseDriver {

    @Test
    public void Test406(){

        TC405_406_Elments elments=new TC405_406_Elments();

        LoginTest();
        elments.findrecord.click();

        elments.find.sendKeys("100JAN"+ Keys.ENTER);


        wait.until(ExpectedConditions.visibilityOfAllElements(elments.Records));

        Assert.assertFalse(elments.Records.isEmpty());



    }

}
