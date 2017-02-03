package pages.message.attached;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by HP on 1/25/2017.
 */
public class AttachedPage {

    WebDriver driver;

    @FindBy(className = "android.widget.FrameLayout")
    private List<WebElement> file;

    public AttachedPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void chooseFile(){file.get(7).click();}
















}
