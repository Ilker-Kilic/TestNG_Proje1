package US_401;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_401 extends BaseDriver {
    public TC_401() {
        PageFactory.initElements(BaseDriver.driver, this);

    }


        // Kullanıcı, [DEMO] butonuna tıklar
        @FindBy(xpath = "//a[text()='Demo']")
        public WebElement demoClick;

        // Kullanıcı, [Explore OpenMRS 2] butonuna tıklar
        @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
        public WebElement exploreOpenMRS2;

        //Kullanıcı, [Enter the OpenMRS 2 Demo] butonuna tıklar
        @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
        public WebElement enterOpen2;

        //Kullanıcı, oturum açma sayfasına yönlendirilir.


        //Kullanıcı, Customer Data'daki geçersiz bir kullanıcı adını ve bir şifreyi girer.
        //            "Giriş" düğmesine tıklar.

        @FindBy(id = "username")
        public WebElement yanlisUserName;

        @FindBy(id = "password")
        public WebElement yanlisPassword;


        //Kullanıcı, [You must choose a location!] uyarısını alır.


        // Kullanıcı, Customer Data'daki location bölümlerini görebilmeli ve tıklayabilmelidir.


        // Kullanıcı, [Inpatient Ward] butonuna tıklar.
        @FindBy(xpath = "//li[@text()='Inpatient Ward']")
        public WebElement InpatientClick;


        // Kullanıcı, tekrar Customer Data'daki geçersiz bir kullanıcı adını ve bir şifreyi girer.
        //            "Giriş" düğmesine tıklar.


//    Kullanıcı, [Invalid username/password. Please try again.] uyarısını alır.


//            (Kullanıcı, geçerli data ile başarıyla oturum açar. - isteğe bağlı)*/


    }

