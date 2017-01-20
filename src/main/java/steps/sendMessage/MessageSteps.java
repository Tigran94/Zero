package steps.sendMessage;

import org.openqa.selenium.WebDriver;
import pages.fab.FabPage;
import pages.menu.MenuPage;
import pages.message.SendMessagePage;
import pages.sections.InboxPage;
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

    public void sendMessage(){

        yahoo=new YahooSteps(driver);
        fab=new FabPage(driver);
        message=new SendMessagePage(driver);
        addAccount=new MenuPage(driver);
        inbox=new InboxPage(driver);

        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        fab.pressOnFabButton();
        fab.pressOnComposeButton();
        message.writeMessage("barev axper");
        message.writeTo("levMik94@yahoo.com");
        message.writeSubject("Barev");
        message.pressOnSendButton();
        addAccount.pressOnMenuButton();
        addAccount.pressOnAddAccount();
        yahoo.loginYahoo("levMik94@yahoo.com","Makardak123");
        inbox.pressOnInbox();



    }




}
