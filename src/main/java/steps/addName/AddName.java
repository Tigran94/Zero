package steps.addName;

import org.openqa.selenium.WebDriver;
import pages.accountSettings.AccountSettingsPage;
import pages.menu.MenuPage;
import pages.sections.SettingsPage;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/24/2017.
 */
public class AddName {

    YahooSteps yahoo;
    MenuPage menu;
    SettingsPage account;
    AccountSettingsPage name;
    SettingsPage back;
    WebDriver driver;

    public AddName(WebDriver driver){this.driver=driver;}
    public void addYahooName() throws InterruptedException {

        yahoo=new YahooSteps(driver);
        menu=new MenuPage(driver);
        account=new SettingsPage(driver);
        name=new AccountSettingsPage(driver);


        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        menu.pressOnMenuButton();
        Thread.sleep(3000);
        menu.pressOnSettingsAccount();
        Thread.sleep(10000);
        account.pressOnAccount();
        Thread.sleep(18000);
        name.addingName("Levon");
        Thread.sleep(7000);
        name.pressOnBackButton();
        Thread.sleep(5000);
        back.pressOnBackButton();
        Thread.sleep(9000);
        menu.pressOnMenuButton();






    }




}
