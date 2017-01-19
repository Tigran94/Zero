package steps.account;

import pages.accountSettings.AccountSettingsPage;
import pages.menu.MenuPage;
import pages.sections.SettingsPage;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/19/2017.
 */
public class RemoveAccountSteps {

    YahooSteps yahoo;
    MenuPage menu;
    MenuPage settings;
    SettingsPage account;
    AccountSettingsPage remove;
    AccountSettingsPage back;

    public void removeYahooAccount(){
        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        menu.pressOnMenuButton();
        settings.pressOnSettingsAccount();
        account.pressOnAccount();
        remove.pressOnRemoveAccountButton();
        back.pressOnBackButton();


    }






}
