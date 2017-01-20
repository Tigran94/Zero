package pages.fab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/18/2017.
 */
public class FabPage {

    WebDriver driver;

    @FindBy(className = "android.widget.ImageButton")
    private WebElement fabButton;

    @FindBy(id = "mail.zero.com.zeromail:id/fab_item_compose")
    private WebElement composeButton;

    public FabPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnFabButton(){fabButton.click();}
    public void pressOnComposeButton(){composeButton.click();}
}
