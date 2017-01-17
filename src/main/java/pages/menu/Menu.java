package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/17/2017.
 */
public class Menu {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebDriver MenuButton;

    @FindBy(id = "mail.zero.com.zeromail:id/current_email_switcher")
    private WebDriver CurrentEmailSwitcher;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='INBOX']")
    private WebDriver INBOX;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Sent']")
    private WebDriver Sent ;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Archive']")
    private WebDriver Archive;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Draft']")
    private WebDriver Draft;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Bulk Mail']")
    private WebDriver BulkMail;


    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Snoozed']")
    private WebDriver Snoozed;






}

