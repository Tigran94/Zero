package steps.sendMessage;

import org.openqa.selenium.WebDriver;
import pages.fab.FabPage;
import pages.menu.MenuPage;
import pages.message.SendMessagePage;
import pages.sections.InboxPage;
import steps.assertions.MessageAssert;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/19/2017.
 */
public class MessageSteps {

    YahooSteps yahoo;
    FabPage fab;
    SendMessagePage message;
    MenuPage addAccount;
    InboxPage inbox;
    WebDriver driver;

    public MessageSteps(WebDriver driver)
    {
        this.driver=driver;
    }

    public void sendMessage() throws InterruptedException {

        yahoo=new YahooSteps(driver);
        fab=new FabPage(driver);
        message=new SendMessagePage(driver);
        addAccount=new MenuPage(driver);
        inbox=new InboxPage(driver);



        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        fab.pressOnFabButton();
        fab.pressOnComposeButton();
        message.writeMessage("barev axper");
        Thread.sleep(3000);
        message.writeSubject("Barev");
        Thread.sleep(3000);
        message.writeTo("levMik94@yahoo.com");
        Thread.sleep(3000);
        message.pressOnSendButton();
        Thread.sleep(3000);
        addAccount.pressOnMenuButton();
        Thread.sleep(3000);
        addAccount.pressOnAddAccount();
        Thread.sleep(9000);
        yahoo.loginYahoo("levMik94@yahoo.com","Makardak123");
        Thread.sleep(3000);
        inbox.pressOnInbox();





    }




}
