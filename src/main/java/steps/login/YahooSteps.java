package steps.login;

import org.openqa.selenium.WebDriver;
import pages.AddAccountPage;
import pages.login.AccountDetailsPage;
import pages.login.LogInPage;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/19/2017.
 */
public class YahooSteps {

    AddAccountPage addAccount;
    LogInPage login;
    AccountDetailsPage accountDetais;
    MenuPage menu;
    WebDriver driver;
    public YahooSteps(WebDriver driver)
    {
        this.driver=driver;
    }

    public void loginYahoo(String user,String password){
        addAccount=new AddAccountPage(driver);
        login=new LogInPage(driver);
        accountDetais=new AccountDetailsPage(driver);
        menu=new MenuPage(driver);

        addAccount.clickOnYahoo();
        login.writeEmail(user);
        login.writePassword(password);
        login.pressOnLogIn();
        accountDetais.pressOnDoneButton();
        menu.pressOnMenuButton();


    }


}
