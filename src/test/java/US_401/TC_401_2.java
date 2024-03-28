package US_401;

import Utility.BaseDriver;
import Utility.BaseDriver2;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.util.Elements;

public class TC_401_2 extends BaseDriver {

    @Test
            public void Test1(){

        TC_401 Elements=new TC_401();

        Elements.demoClick.click();
        Elements.exploreOpenMRS2.click();
        Elements.enterOpen2.click();
        Elements.yanlisUserName.sendKeys("aaa");
        Elements.yanlisPassword.sendKeys("bbbb");
        Assert.assertTrue(driver.getCurrentUrl().contains("login.html"));

    }


}
