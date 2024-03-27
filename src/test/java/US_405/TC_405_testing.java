package US_405;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_405_testing extends BaseDriver {


@Test
    public void Tc405(){
    TC405_406_Elments elements1=new TC405_406_Elments();
    LoginTest();

    Actions actions=new Actions(driver);
   actions.moveToElement(elements1.adminButton).build().perform();

    wait.until(ExpectedConditions.visibilityOf(elements1.MyAccountLink));

    Assert.assertTrue(elements1.MyAccountLink.isDisplayed(),"None");

    elements1.MyAccountLink.click();

    Assert.assertFalse(elements1.SettingLinks.isEmpty());


    for(WebElement e : elements1.SettingLinks){

        Assert.assertTrue(e.isEnabled());
    }

}

}
