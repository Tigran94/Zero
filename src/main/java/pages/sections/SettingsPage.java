package pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/18/2017.
 */
public class SettingsPage {
    WebDriver driver;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(id = "mail.zero.com.zeromail:id/settings_account_email")
    private WebElement account;

    public SettingsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnAccount(){account.click();}
    public void pressOnBackButton(){backButton.click();}


}
