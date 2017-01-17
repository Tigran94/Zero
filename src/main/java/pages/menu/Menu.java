package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/17/2017.
 */
public class Menu {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebDriver menuButton;

    @FindBy(id = "mail.zero.com.zeromail:id/current_email_switcher")
    private WebDriver currentEmailSwitcher;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='INBOX']")
    private WebDriver inbox;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Sent']")
    private WebDriver sent ;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Archive']")
    private WebDriver archive;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Draft']")
    private WebDriver draft;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Bulk Mail']")
    private WebDriver bulkMail;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Snoozed']")
    private WebDriver snoozed;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Zero']")
    private WebDriver zero;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Add account']")
    private WebDriver addAccount;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Settings']")
    private WebDriver settings;

    @FindBy(xpath = "//android.widget.TextView[@text='Feedback']")
    private WebDriver feedback;

    @FindBy(xpath = "//android.widget.TextView[@text='Tutorial']")
    private WebDriver tutorial;

    @FindBy(xpath = "//android.widget.TextView[@text='Rate The App']")
    private WebDriver rateTheApp;






}

