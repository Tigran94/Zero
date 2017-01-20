package pages.login;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by HP on 1/16/2017.
 */
public class LogInPage {
    WebDriver driver;
    @FindBy(xpath ="//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    @FindBy(id = "mail.zero.com.zeromail:id/user_email_wrapper")
    private WebElement email;

    @FindBy(id = "mail.zero.com.zeromail:id/user_password_wrapper")
    private WebElement password;

    @FindBy(id = "mail.zero.com.zeromail:id/text_input_password_toggle")
    private WebElement eyeButton;

    @FindBy(id = "mail.zero.com.zeromail:id/sign_in_btn")
    private WebElement logInButton;

    public LogInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void writeEmail(String login){email.sendKeys(login);}
    public void writePassword(String parole){password.sendKeys(parole);}
    public void pressOnLogIn(){logInButton.click();}


}
