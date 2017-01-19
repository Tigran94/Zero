package steps.sendMessage;

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
    FabPage compose;
    SendMessagePage message;
    SendMessagePage to;
    SendMessagePage subject;
    SendMessagePage send;
    MenuPage menu;
    MenuPage addAccount;
    InboxPage inbox;


    public void sendMessage(){

        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        fab.pressOnFabButton();
        compose.pressOnComposeButton();
        message.writeMessage("barev axper");
        to.writeTo("levMik94@yahoo.com");
        subject.writeSubject("Barev");
        send.pressOnSendButton();
        menu.pressOnMenuButton();
        addAccount.pressOnAddAccount();
        yahoo.loginYahoo("levMik94@yahoo.com","Makardak123");
        inbox.pressOnInbox();



    }




}
