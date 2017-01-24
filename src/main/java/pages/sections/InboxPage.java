package pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/19/2017.
 */
public class InboxPage {
    WebDriver driver;
    @FindBy(xpath = "//android.widget.LinearLayout[@index='1']")
    private WebElement chooseInboxMessage;

    @FindBy(xpath = "//mail.zero.com.zeromail:id/threadEmailTitle[@text='test.test599@yahoo.com']")
    private WebElement message;

    public InboxPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnInbox(){chooseInboxMessage.click();}
    public String getMessageSenderName(){return message.getText();}


}
