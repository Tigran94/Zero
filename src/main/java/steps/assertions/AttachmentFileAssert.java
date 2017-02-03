package steps.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.MenuPage;
import pages.message.SendMessagePage;

/**
 * Created by HP on 1/25/2017.
 */
public class AttachmentFileAssert {

    SendMessagePage attached;
    WebDriver driver;


    public AttachmentFileAssert(WebDriver driver)
    {
        this.driver=driver;
    }

    public void assertAttachedFile(){
        attached=new SendMessagePage(driver);
        String name = attached.getFileName();
        Assert.assertTrue(name.equals("Screenshot_2017-01-20-17-54-47.png"));
    }

}
