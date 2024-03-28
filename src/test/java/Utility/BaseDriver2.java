package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver2 {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri()  // TearStart
    {
        //System.out.println("Baslangic İşlemleri Yapılıyor"); // driver oluşturma,wait işlemleri
        driver=new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet : sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet : elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    public void LoginTest2(){

        System.out.println("Login Test Başladı");
        driver.get("https://openmrs.org");
        Tools.Bekle(6);
        WebElement democlick=driver.findElement(By.xpath("//a[text()='Gösteri']"));
        democlick.click();

        WebElement OpenMrs2=driver.findElement(By.xpath("//*[text()='Keşfet OpenMRS 2']"));
        OpenMrs2.click();
        Tools.Bekle(2);
        WebElement OpenMrsDemosu=driver.findElement(By.xpath("//span[text()='Girin OpenMRS 2 Demosu']"));
        OpenMrsDemosu.click();

        WebElement email= driver.findElement(By.id("username"));
        email.sendKeys("admin");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Admin123");

        WebElement laboratuary=driver.findElement(By.xpath( "//ul[@id='sessionLocation']/li[3]"));
        laboratuary.click();

        WebElement logiBtn=driver.findElement(By.id("loginButton"));
        logiBtn.click();



    }

    public void Logout(){
        WebElement logout=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
        logout.click();

    }
    @AfterClass
    public void KapanisIslemleri() // TearDown
    {
        System.out.println("Kapanış İşlemleri Yapılıyor"); // BekleKapat
        Tools.Bekle(3);
        driver.quit();

    }



}