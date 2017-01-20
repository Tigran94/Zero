package steps.assertions;

import org.testng.Assert;
import pages.AddAccountPage;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/19/2017.
 */
public class RemoveAssert {

    AddAccountPage addAccount;

    public void removeUser(){
        String text = addAccount.getAddAccountText();
        Assert.assertTrue(text.equals("Add account"));
    }

}
