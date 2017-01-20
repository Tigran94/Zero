package pages.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/19/2017.
 */
public class InboxPage {

    @FindBy(xpath = "//mail.zero.com.zeromail:id/mail_author[@text='test.test599@yahoo.com']")
    private WebElement chooseInboxMessage;

    @FindBy(xpath = "//mail.zero.com.zeromail:id/threadEmailTitle[@text='test.test599@yahoo.com']")
    private WebElement message;

    public void pressOnInbox(){chooseInboxMessage.click();}
    public String getMessageSenderName(){return message.getText();}


}
