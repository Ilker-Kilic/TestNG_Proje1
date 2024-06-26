package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tools {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public static void SuccessMessageValidation(){
        WebElement msgLabel= BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(((WebElement) msgLabel).getText().toLowerCase().contains("success"));
    }

    public static void JSClick(WebElement e){
        JavascriptExecutor js=(JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].click();", e); // js click : sayfanın içinden click
    }
}

