package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/16/2017.
 */
public class GoogleLogInPage {
    WebDriver driver;
    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    public GoogleLogInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
