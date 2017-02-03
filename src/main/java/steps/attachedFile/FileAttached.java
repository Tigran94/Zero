package steps.attachedFile;

import org.openqa.selenium.WebDriver;
import pages.fab.FabPage;
import pages.menu.MenuPage;
import pages.message.SendMessagePage;
import pages.message.attached.AttachedPage;
import pages.sections.InboxPage;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/25/2017.
 */
public class FileAttached {

    YahooSteps yahoo;
    FabPage fab;
    SendMessagePage message;
    AttachedPage file;
    WebDriver driver;

    public FileAttached(WebDriver driver) {
        this.driver = driver;
    }

    public void attachedFile() throws InterruptedException {

        yahoo = new YahooSteps(driver);
        fab = new FabPage(driver);
        message = new SendMessagePage(driver);
        file = new AttachedPage(driver);


        yahoo.loginYahoo("test.test599@yahoo.com", "fatestyahoo100");
        Thread.sleep(6000);
        fab.pressOnFabButton();
        Thread.sleep(3000);
        fab.pressOnComposeButton();
        Thread.sleep(9000);
        message.pressOnAttachedButton();
        Thread.sleep(8000);
        file.chooseFile();
        Thread.sleep(7000);


    }
}