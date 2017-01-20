package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by HP on 1/16/2017.
 */
public class AddAccountPage {

    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Add account']")
    private WebElement addAccountText;

   @FindBy(id = "mail.zero.com.zeromail:id/add_account_logo")
   private List<WebElement> mail;




    public void clickOnYahoo(){
        mail.get(4).click();
    }
    public String getAddAccountText(){return addAccountText.getText();}



}
