package steps.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/24/2017.
 */
public class ChangeEmailAssert {

    MenuPage user;
    WebDriver driver;
    public ChangeEmailAssert(WebDriver driver)
    {
        this.driver=driver;
    }

    public void userChangingAssert(){
        user=new MenuPage(driver);
        String name = user.getUser();
        Assert.assertTrue(name.equals("test.test599@yahoo.com"));
    }



}
