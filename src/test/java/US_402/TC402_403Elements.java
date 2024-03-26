package US_402;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC402_403Elements {
    public TC402_403Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(xpath = "//a[text()='Gösteri']")
    public WebElement demoClick;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Keşfet OpenMRS 2']")
    public WebElement OpenMrs2;

    @FindBy(xpath = "//span[text()='Girin OpenMRS 2 Demosu']")
    public WebElement OpenMrsDemosu;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
    public WebElement logout;

}
