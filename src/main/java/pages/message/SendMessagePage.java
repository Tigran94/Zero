package pages.message;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/18/2017.
 */
public class SendMessagePage {
    WebDriver driver;
    @FindBy(id = "mail.zero.com.zeromail:id/new_email_message")
    private WebElement messageField;

    @FindBy(id = "mail.zero.com.zeromail:id/recipient_container_to_root")
    private WebElement toField;

    @FindBy(id = "mail.zero.com.zeromail:id/new_email_subject")
    private WebElement subjectField;

    @FindBy(id = "mail.zero.com.zeromail:id/new_email_send")
    private WebElement sendButton;
    public SendMessagePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void writeMessage(String message){messageField.sendKeys(message);}
    public void writeTo(String to){messageField.sendKeys(to);}
    public void writeSubject(String emailsubject){subjectField.sendKeys(emailsubject);}
    public void pressOnSendButton(){sendButton.click();}
}
