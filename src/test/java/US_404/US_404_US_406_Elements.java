package US_404;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_404_US_406_Elements {

    public US_404_US_406_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "givenName")
    public WebElement name;

    @FindBy(name = "familyName")
    public WebElement familyName;

    @FindBy(id = "next-button")
    public WebElement next;
    @FindBy(id = "gender-field")
    public WebElement gender;
    @FindBy(xpath = "//input[@name='birthdateDay']")
    public WebElement birthdateDay;

    @FindBy(id = "birthdateMonth-field")
    public WebElement birthdateMonth;
    @FindBy(xpath = "//input[@name='birthdateYear']")
    public WebElement birthdateYear;
    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address1;
    @FindBy(xpath = "//input[@name='address2']")
    public WebElement address2;
    @FindBy(xpath = "//input[@name='cityVillage']")
    public WebElement cityVillage;
    @FindBy(xpath = "//input[@name='stateProvince']")
    public WebElement stateProvince;
    @FindBy(xpath = "//input[@name='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@name='postalCode']")
    public WebElement postalCode;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(id = "relationship_type")
    public WebElement relationship_type;
    @FindBy(xpath = "//input[@placeholder='Person Name']")
    public WebElement person_Name;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(className = "form-control")
    public WebElement formControl;
    @FindBy(xpath = "//*[@name=\"mothersname\"]")
    public WebElement mothersname;

    @FindBy(id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement delete;
    @FindBy(xpath = "//input[@id='delete-reason']")
    public WebElement reason;
    @FindBy(xpath = "//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]")
    public WebElement submitReason;
    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/div[1]/div/div[1]/h1/span[2]/span")
    public WebElement alert1;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]")
    public WebElement alert2;
    @FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[2]")
    public WebElement deleteName;

}
