package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/17/2017.
 */
public class MenuPage {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement menuButton;

    @FindBy(xpath = "//mail.zero.com.zeromail:id/current_user_email[@text='test.test599@yahoo.com']")
    private WebElement user;

    @FindBy(id = "mail.zero.com.zeromail:id/current_email_switcher")
    private WebElement currentEmailSwitcher;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='INBOX']")
    private WebElement inbox;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Sent']")
    private WebElement sent ;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Archive']")
    private WebElement archive;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Draft']")
    private WebElement draft;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Bulk Mail']")
    private WebElement bulkMail;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Snoozed']")
    private WebElement snoozed;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Zero']")
    private WebElement zero;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Add account']")
    private WebElement addAccount;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='SettingsPage']")
    private WebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@text='Feedback']")
    private WebElement feedback;

    @FindBy(xpath = "//android.widget.TextView[@text='Tutorial']")
    private WebElement tutorial;

    @FindBy(xpath = "//android.widget.TextView[@text='Rate The App']")
    private WebElement rateTheApp;

    public void pressOnMenuButton(){menuButton.click();}
    public void pressOnAddAccount(){addAccount.click();}
    public void pressOnSettingsAccount(){settings.click();}
    public String getUser(){return user.getText();}


}

