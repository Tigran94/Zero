package steps.login;

import org.openqa.selenium.WebDriver;
import pages.AddAccountPage;
import pages.login.AccountDetailsPage;
import pages.login.LogInPage;
import pages.menu.MenuPage;
import steps.assertions.LoginAssert;

/**
 * Created by HP on 1/19/2017.
 */
public class YahooSteps {

    AddAccountPage addAccount;
    LogInPage login;
    AccountDetailsPage accountDetais;
    WebDriver driver;
    public YahooSteps(WebDriver driver)
    {
        this.driver=driver;
    }

    public void loginYahoo(String user,String password) throws InterruptedException {
        addAccount=new AddAccountPage(driver);
        login=new LogInPage(driver);
        accountDetais=new AccountDetailsPage(driver);


        addAccount.clickOnYahoo();
        login.writeEmail(user);
        login.writePassword(password);
        login.pressOnLogIn();
        Thread.sleep(14000);
        accountDetais.pressOnDoneButton();
        Thread.sleep(9000);


    }


}
