package steps.changeEmail;

import org.openqa.selenium.WebDriver;
import pages.menu.emails.EmailsPage;
import pages.menu.MenuPage;
import steps.login.YahooSteps;

/**
 * Created by HP on 1/24/2017.
 */
public class ChangeEmailSteps {
    YahooSteps yahoo;
    MenuPage menu;
    EmailsPage user;
    WebDriver driver;

    public ChangeEmailSteps(WebDriver driver){this.driver=driver;}
    public void changeEmail() throws InterruptedException {
        yahoo=new YahooSteps(driver);
        menu=new MenuPage(driver);
        user=new EmailsPage(driver);

        yahoo.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        Thread.sleep(5000);
        menu.pressOnMenuButton();
        Thread.sleep(5000);
        menu.pressOnAddAccount();
        Thread.sleep(5000);
        yahoo.loginYahoo("levMik94@yahoo.com","Makardak123");
        Thread.sleep(5000);
        menu.pressOnMenuButton();
        Thread.sleep(5000);
        menu.pressOnEmailSwitcher();
        Thread.sleep(6000);
        user.chooseUser();
        Thread.sleep(6000);
        menu.pressOnMenuButton();



    }
}