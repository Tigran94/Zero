package pages.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/18/2017.
 */
public class SettingsPage {

    @FindBy(xpath = "//mail.zero.com.zeromail:id/settings_account_email[@text='test.test599@yahoo.com']")
    private WebElement account;

    public void pressOnAccount(){account.click();}


}
