package pages.menu.emails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by HP on 1/25/2017.
 */
public class EmailsPage {

    WebDriver driver;

    @FindBy(className = "android.support.v7.widget.LinearLayoutCompat")
    private List<WebElement> userEmail;

    public EmailsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void chooseUser(){
        userEmail.get(1).click();
    }


}
