package pages;


import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by HP on 1/16/2017.
 */
public class AddAccountPage {
    WebDriver driver;
    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Add account']")
    private WebElement addAccountText;

   @FindBy(id = "mail.zero.com.zeromail:id/add_account_logo")
   private List<WebElement> mail;

    public AddAccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnYahoo(){
        mail.get(4).click();
    }
    public String getAddAccountText(){return addAccountText.getText();}



}
