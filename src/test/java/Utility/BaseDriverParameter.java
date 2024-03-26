package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import javax.xml.stream.events.EntityDeclaration;
import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public WebDriverWait wait;


    @BeforeClass
    @Parameters("browserType")
    public void BaslangicIslemleri(String browserType) { // TearStart
        // System.out.println("başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,

        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

       driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Tools.Bekle(2);

    }

    public void LoginTest() {
        System.out.println("Login Test Başladı");
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        Tools.Bekle(2);

        WebElement email= driver.findElement(By.id("username"));
        email.sendKeys("admin");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Admin123");

        WebElement laboratuary=driver.findElement(By.xpath( "//ul[@id='sessionLocation']/li[3]"));
        laboratuary.click();

        WebElement logiBtn=driver.findElement(By.id("loginButton"));
        logiBtn.click();
        System.out.println("Login Test bitti");
    }

    @AfterClass
    public void KapanisIslemleri() {  // TearDown
        //System.out.println("kapanış işlemleri yapılıyor"); //BekleKapat

        //logout
        Tools.Bekle(3);
        driver.quit();
    }

}
