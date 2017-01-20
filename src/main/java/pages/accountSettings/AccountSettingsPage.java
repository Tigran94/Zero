package pages.accountSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/18/2017.
 */
public class AccountSettingsPage {

    WebDriver driver;

    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(id = "mail.zero.com.zeromail:id/account_settings_remove_account")
    private WebElement removeAccount;

    public AccountSettingsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnRemoveAccountButton(){removeAccount.click();}
    public void pressOnBackButton(){backButton.click();}


}
