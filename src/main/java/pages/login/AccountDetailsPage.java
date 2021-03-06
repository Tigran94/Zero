package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/17/2017.
 */
public class AccountDetailsPage {
    WebDriver driver;

    @FindBy(id = "mail.zero.com.zeromail:id/account_details_name_edit_text")
    private WebElement name;

    @FindBy(id = "mail.zero.com.zeromail:id/account_details_description_edit_text")
    private WebElement description;

    @FindBy(id = "mail.zero.com.zeromail:id/add_descriptions_done_btn")
    private WebElement doneButton;

    public AccountDetailsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void pressOnDoneButton(){doneButton.click();}


}
