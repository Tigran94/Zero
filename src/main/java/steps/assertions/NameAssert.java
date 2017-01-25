package steps.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/24/2017.
 */
public class NameAssert {

    MenuPage userName;
    WebDriver driver;



    public NameAssert(WebDriver driver){this.driver=driver;}

    public void assertUserName(){
        userName=new MenuPage(driver);
        String name = userName.getUserName();
        Assert.assertTrue(name.equals("Levon"));
    }

}
