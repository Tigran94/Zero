package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/17/2017.
 */
public class AccountDetails {

    @FindBy(id = "mail.zero.com.zeromail:id/account_details_name_edit_text")
    private WebElement Name;

    @FindBy(id = "mail.zero.com.zeromail:id/account_details_description_edit_text")
    private WebElement Description;

    @FindBy(id = "mail.zero.com.zeromail:id/add_descriptions_done_btn")
    private WebElement DoneButton;




}
