package US_405;

import Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC405_406_Elments {
    public TC405_406_Elments() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]")
    public WebElement adminButton;

    @FindBy(xpath = "//*[@id=\"user-account-menu\"]/li/a")
    public WebElement MyAccountLink;

    @FindBy(xpath = "/html/body/div/div[3]/div")
    public List<WebElement> SettingLinks;


    // 406 elements
    @FindBy(xpath = "//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
    public WebElement findrecord;


    @FindBy(xpath = "//input[@id=\"patient-search\"]")
    public WebElement find;



    @FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody")
    public List<WebElement> Records;

    @FindBy(xpath = "//*[td[text()='100JAN']]")
    public WebElement records100Jan;

    @FindBy(xpath = "//*[@id=\"content\"]/div[9]/div[1]/div/div[1]")
    public WebElement records100janDocument;

    @FindBy(xpath = "//*[td[text()='No matching records found']]")
    public WebElement NoneMatch;





}
