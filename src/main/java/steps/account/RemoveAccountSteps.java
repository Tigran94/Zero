package steps.account;

import org.openqa.selenium.WebDriver;
import pages.accountSettings.AccountSettingsPage;
import pages.menu.MenuPage;
import pages.sections.SettingsPage;
import steps.assertions.RemoveAssert;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/19/2017.
 */
public class RemoveAccountSteps {

    YahooSteps yahoo;
    MenuPage menu;
    SettingsPage account;
    AccountSettingsPage remove;
    RemoveAssert removeAssert;
    WebDriver driver;
    public RemoveAccountSteps(WebDriver driver)
    {
        this.driver=driver;
    }
    public void removeYahooAccount() throws InterruptedException {
        yahoo=new YahooSteps(driver);
        menu=new MenuPage(driver);
        account=new SettingsPage(driver);
        remove=new AccountSettingsPage(driver);
        removeAssert=new RemoveAssert(driver);

        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        Thread.sleep(10000);
        menu.pressOnMenuButton();
        Thread.sleep(3000);
        menu.pressOnSettingsAccount();
        Thread.sleep(2000);
        account.pressOnAccount();
        Thread.sleep(2000);
        remove.pressOnRemoveAccountButton();
        Thread.sleep(3000);
        remove.pressOnBackButton();
        removeAssert.removeUser();


    }






}
