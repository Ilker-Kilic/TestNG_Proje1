package US_407;

import US_404.US_404_US_406_Elements;
import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_407 extends BaseDriver {
    @Test

    public void PatientDeletion() throws AWTException {
        US_404_US_406_Elements elements = new US_404_US_406_Elements();

        Robot robot = new Robot();

        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        elements.formControl.sendKeys("William" + Keys.ENTER);

        elements.deleteName.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.delete));
        elements.delete.click();


        elements.reason.sendKeys("Death");
        elements.submitReason.click();
        Assert.assertFalse(elements.alert2.getText().equals("William"), "Search Not Found");

    }
}

