package US_408;

import US_405.TC405_406_Elments;
import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC408_409_Elments {
    public TC408_409_Elments(){
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
    public WebElement FindPatient;
    @FindBy(xpath="//*[@id=\"patient-search-results-table\"]/tbody/tr")
    public List<WebElement> Records;
    @FindBy(xpath = "//*[@id=\"patient-search-results-table_info\"]")
    public WebElement dataTableInfo;
    @FindBy(xpath = "//*[@id='patient-search-results-table_next']")
    public WebElement dataTableNext;
    @FindBy(xpath = "/html/body/header/nav/div[1]/a")
    public WebElement goHomePage;
    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div")
    public WebElement getID;

    @FindBy(xpath = "//*[@id=\"coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension\"]")
    public WebElement DataManagement;

    @FindBy(xpath = "//*[@id=\"coreapps-mergePatientsHomepageLink-app\"]")
    public WebElement MergePatients;

    @FindBy(xpath = "//*[@id=\"patient1-text\"]")
    public WebElement Patient1;

    @FindBy(xpath = "//*[@id=\"patient2-text\"]")
    public WebElement Patient2;

    @FindBy(xpath = "//*[@id=\"confirm-button\"]")
    public WebElement mergeConfirm;

    @FindBy(xpath ="//*[@id=\"second-patient\"]")
    public WebElement selectPatient;

    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[2]/div")
    public WebElement isMerge;

}
