package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/16/2017.
 */
public class AddAccount {

    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='0']")
    private WebElement google;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='1']")
    private WebElement iCloud;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='2']")
    private WebElement outlook;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='3']")
    private WebElement hotmail;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='4']")
    private WebElement yahoo;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='5']")
    private WebElement office365;

    @FindBy(xpath = "//android.widget.FrameLayout[@index='6']")
    private WebElement exchange;


}
