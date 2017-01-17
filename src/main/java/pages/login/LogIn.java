package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HP on 1/16/2017.
 */
public class LogIn {

    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement BackButton;

    @FindBy(id = "mail.zero.com.zeromail:id/user_email_wrapper")
    private WebElement Email;

    @FindBy(id = "mail.zero.com.zeromail:id/user_password_wrapper")
    private WebElement Password;

    @FindBy(id = "mail.zero.com.zeromail:id/text_input_password_toggle")
    private WebElement EyeButton;

    @FindBy(id = "mail.zero.com.zeromail:id/sign_in_btn")
    private WebElement LogInButton;


}
