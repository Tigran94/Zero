package steps.login;

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

    public void loginYahoo(String user,String password){
        addAccount.clickOnYahoo();
        login.writeEmail(user);
        login.writePassword(password);
        login.pressOnLogIn();
        accountDetais.pressOnDoneButton();
        menu.pressOnMenuButton();


    }


}
