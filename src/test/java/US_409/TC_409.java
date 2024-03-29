package US_409;

import US_404.US_404_US_406_Elements;
import US_408.TC408_409_Elments;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_409 extends BaseDriver {
    private String ID1;
    private String ID2;
    @Test
    public void PatientRegistration() throws AWTException {
        US_404_US_406_Elements elements = new US_404_US_406_Elements();
        TC408_409_Elments myElements = new TC408_409_Elments();

        LoginTest();
        Robot robot = new Robot();

        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        elements.name.sendKeys("Ali");
        elements.familyName.sendKeys("Cömert");
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
        elements.person_Name.sendKeys("Unknown");
        elements.next.click();

        elements.submit.click();
        Tools.Bekle(5);
        System.out.println("Soyad Kontrol Ediliyor... : "+elements.alert1.getText());
        Assert. assertTrue(elements.alert1.getText().contains("Cömert"));
        String IDFull = myElements.getID.getText();
        ID1 = IDFull.substring(10);
        System.out.println("ID = " +ID1 );

    }
    @Test
    public void PatientRegistration2() throws AWTException {
        US_404_US_406_Elements elements = new US_404_US_406_Elements();
        TC408_409_Elments myElements = new TC408_409_Elments();
        Robot robot = new Robot();
        myElements.goHomePage.click();
        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        elements.name.sendKeys("Gencer");
        elements.familyName.sendKeys("Genç");
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
        elements.person_Name.sendKeys("Gencer");
        elements.next.click();

        elements.submit.click();
        Tools.Bekle(5);
        System.out.println("Soyad Kontrol Ediliyor... : "+elements.alert1.getText());
        Assert. assertTrue(elements.alert1.getText().contains("Genç"));
        String IDFull = myElements.getID.getText();
        ID2 = IDFull.substring(10);

        System.out.println("ID = " +ID2 );

    }

    @Test
    public void PatientRegistration3() throws AWTException {
        TC408_409_Elments myElements = new TC408_409_Elments();
        myElements.goHomePage.click();
        myElements.DataManagement.click();
        myElements.MergePatients.click();

        myElements.Patient1.sendKeys(ID1);
        myElements.Patient2.sendKeys(ID2);
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        wait.until(ExpectedConditions.elementToBeClickable(myElements.mergeConfirm));
        myElements.mergeConfirm.click();
        wait.until(ExpectedConditions.elementToBeClickable(myElements.selectPatient));
        myElements.selectPatient.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(myElements.mergeConfirm));
        myElements.mergeConfirm.click();
        System.out.println(myElements.isMerge.getText());
        String Patient1_2="Patient ID"+ID1+ID2;
        Assert.assertEquals(Patient1_2,myElements.isMerge.getText(),"Patient ID"+ID1+" "+ID2);

    }

}
