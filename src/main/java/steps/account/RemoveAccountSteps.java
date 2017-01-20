package steps.account;

import org.openqa.selenium.WebDriver;
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
    SettingsPage account;
    AccountSettingsPage remove;
    WebDriver driver;
    public RemoveAccountSteps(WebDriver driver)
    {
        this.driver=driver;
    }
    public void removeYahooAccount(){
        yahoo=new YahooSteps(driver);
        menu=new MenuPage(driver);
        account=new SettingsPage(driver);
        remove=new AccountSettingsPage(driver);

        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        menu.pressOnMenuButton();
        menu.pressOnSettingsAccount();
        account.pressOnAccount();
        remove.pressOnRemoveAccountButton();
        remove.pressOnBackButton();


    }






}
