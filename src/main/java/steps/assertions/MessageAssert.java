package steps.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.MenuPage;
import pages.sections.InboxPage;

/**
 * Created by HP on 1/20/2017.
 */
public class MessageAssert {

    InboxPage sender;
    WebDriver driver;
    public MessageAssert(WebDriver driver)
    {
        this.driver=driver;
    }

    public void assertMessage(){
        sender = new InboxPage(driver);
        String messageSender = sender.getMessageSenderName();
        Assert.assertTrue(messageSender.equals("test.test599@yahoo.com"));
    }






}
