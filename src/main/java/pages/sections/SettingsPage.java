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
    @FindBy(xpath = "//mail.zero.com.zeromail:id/settings_account_email[@text='test.test599@yahoo.com']")
    private WebElement account;

    public SettingsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnAccount(){account.click();}


}
