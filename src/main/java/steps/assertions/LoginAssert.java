package steps.assertions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.MenuPage;

/**
 * Created by HP on 1/19/2017.
 */
public class LoginAssert {

    MenuPage user;
    WebDriver driver;
    public LoginAssert(WebDriver driver)
    {
        this.driver=driver;
    }

    public void assertUser(){
        user=new MenuPage(driver);
        String name = user.getUser();
        Assert.assertTrue(name.equals("test.test599@yahoo.com"));
    }




}
