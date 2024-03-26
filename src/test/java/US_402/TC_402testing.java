package US_402;

import Utility.BaseDriver2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_402testing extends BaseDriver2 {
@Test
        public void Tc_402Test(){
    LoginTest2();
    Assert.assertTrue(driver.getCurrentUrl().contains("home.page"));

}













}
