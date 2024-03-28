package US_404;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_404 extends BaseDriver {

    @Test
    public void PatientRegistration() throws AWTException {
        US_404_US_406_Elements elements = new US_404_US_406_Elements();

        Robot robot = new Robot();

        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        elements.name.sendKeys("Ozgur");
        elements.familyName.sendKeys("Karakus");
        elements.next.click();
        elements.gender.click();
        Select genderValue = new Select(elements.gender);
        genderValue.selectByValue("M");
        elements.next.click();

        elements.birthdateDay.sendKeys("15");
        elements.birthdateMonth.click();
        Select monthValue = new Select(elements.birthdateMonth);
        monthValue.selectByValue("5");
        elements.birthdateYear.sendKeys("2005");
        elements.next.click();



        elements.address1.sendKeys("Ata Mahallesi");
        elements.address2.sendKeys("352. Sokak");
          elements.cityVillage.sendKeys("Esenyurt");
         elements.stateProvince.sendKeys("İstanbul");
         elements.country.sendKeys("Türkiye");
         elements.postalCode.sendKeys("34582");
         elements.next.click();

        elements.phoneNumber.sendKeys("050515154855");
        elements.next.click();

        elements.relationship_type.click();
        Select relationship = new Select(elements.relationship_type);
        relationship.selectByIndex(5);
        elements.person_Name.sendKeys("Mehmet ");
        elements.next.click();

        elements.submit.click();
        Tools.Bekle(5);
        System.out.println(elements.alert1.getText());
        Assert.assertTrue(elements.alert1.getText().contains("Karakus"));


    }


}
