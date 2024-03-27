package US_403;

import Utility.BaseDriver2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_403testing extends BaseDriver2 {

    @Test
    public void Tc_403Logout(){

        LoginTest2();
        Logout();
        Assert.assertTrue(driver.getCurrentUrl().contains("login.htm"));


    }
}
