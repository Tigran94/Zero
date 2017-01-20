package steps.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AddAccountPage;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/19/2017.
 */
public class RemoveAssert {

    AddAccountPage addAccount;
    WebDriver driver;
    public RemoveAssert(WebDriver driver)
    {
        this.driver=driver;
    }

    public void removeUser(){
        addAccount=new AddAccountPage(driver);
        String text = addAccount.getAddAccountText();
        Assert.assertTrue(text.equals("Add account"));
    }

}
