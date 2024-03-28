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


}
