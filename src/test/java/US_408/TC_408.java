package US_408;

import US_405.TC405_406_Elments;
import Utility.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_408 extends BaseDriver {

    @Test
    public void Test408() {

        TC408_409_Elments myElements = new TC408_409_Elments();

        LoginTest();
        myElements.FindPatient.click();
        String dataTableText = myElements.dataTableInfo.getText();
        String[] parts = dataTableText.split(" entries", 2); // "entries" metninden önceki kısmı ayır
        String countString = parts[0].replaceAll(".*?(\\d{1,3})$", "$1"); // Sadece son 1-3 rakamı al
        int count = Integer.parseInt(countString);
        System.out.println("Toplam Hasta : " + count);

        int countRecord = myElements.Records.size();

        double divisionResult = (double) count / 15;
        int clickCount = (int) Math.ceil(divisionResult);

        for (int i = 1; i < clickCount; i++) {
            myElements.dataTableNext.click();
            countRecord += myElements.Records.size();
        }
        System.out.println("Toplam Sayılan Hasta : " + countRecord);
        Assert.assertEquals(countRecord, count, "Hasta sayısı eşleşmedi.");
    }

}
