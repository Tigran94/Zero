package pages.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/17/2017.
 */
public class MenuPage {
    WebDriver driver;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement menuButton;

//    @FindBy(xpath = "//mail.zero.com.zeromail:id/current_user_email[@text='test.test599@yahoo.com']")
//    private WebElement user;

    @FindBy(id = "mail.zero.com.zeromail:id/current_email_switcher")
    private WebElement currentEmailSwitcher;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Add account']")
    private WebElement addAccount;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Settings']")
    private WebElement settings;



    public MenuPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void pressOnMenuButton(){menuButton.click();}
    public void pressOnAddAccount(){addAccount.click();}
    public void pressOnSettingsAccount(){settings.click();}
    public String getUser(){
        return  driver.findElement(By.id("mail.zero.com.zeromail:id/current_user_email")).getAttribute("text");
        }
}

