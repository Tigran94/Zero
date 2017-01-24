import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.accountSettings.AccountSettingsPage;
import pages.fab.FabPage;
import pages.menu.MenuPage;
import pages.message.SendMessagePage;
import pages.sections.InboxPage;
import pages.sections.SettingsPage;
import steps.assertions.LoginAssert;
import steps.assertions.MessageAssert;
import steps.assertions.RemoveAssert;
import steps.login.YahooSteps;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by admin on 1/13/17.
 */
public class Test {
    Process p,p1;
    WebDriver driver;

    YahooSteps login;
    LoginAssert loginAssert;

    MenuPage menu;
    SettingsPage settings;
    AccountSettingsPage account;
    RemoveAssert removeAssert;

    FabPage fab;
    SendMessagePage sendMessage;
    InboxPage inbox;
    MessageAssert messageAssert;

    @Before
    public void before() throws IOException, InterruptedException {
        String userDir = System.getProperties().get("user.dir").toString();
       // openCurEmul();
        openTerminal();


        DesiredCapabilities caps= new DesiredCapabilities();
        caps.setCapability("deviceName","3004d4b147463100");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","4.4.2");
        //caps.setCapability("orientation","LANDSCAPE");
        // caps.setCapability("appActivity",".accounts.AddAccountActivity");
        caps.setCapability("app",userDir+"/zero.apk");


        driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);

        login=new YahooSteps(driver);
        loginAssert=new LoginAssert(driver);
        menu=new MenuPage(driver);
        settings=new SettingsPage(driver);
        account=new AccountSettingsPage(driver);
        removeAssert=new RemoveAssert(driver);
        fab=new FabPage(driver);
        sendMessage=new SendMessagePage(driver);
        inbox=new InboxPage(driver);
        messageAssert=new MessageAssert(driver);
        Thread.sleep(10000);

    }

    public void openTerminal() throws IOException, InterruptedException {
        String osName = System.getProperties().getProperty("os.name");

        if (osName.equals("Mac OS X")) {
            String command = "/usr/bin/open -a Terminal /Users/admin/Desktop/do.bash";
            p=Runtime.getRuntime().exec(command);
            Thread.sleep(40000);
        }
        else if(osName.equals("Windows 7")){
            String[] cmd = {"C:\\WINDOWS\\system32\\cmd.exe","/c","start","c:\\Users\\HP\\Desktop\\Zero.bat"};
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(cmd);
            Thread.sleep(10000);
        }
        else if(osName.equals("Windows 8.1")){
            String[] cmd = {"C:\\WINDOWS\\system32\\cmd.exe","/c","start","C:\\Users\\Levon Mikaelyan\\Desktop\\Zero.bat"};
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(cmd);
            Thread.sleep(10000);
        }
    }

    public void openCurEmul() throws IOException {
        String command1="emulator -avd Nexus_5X_API_19";
        p1=Runtime.getRuntime().exec(command1);
    }
    @org.junit.Test
    public void yahooLogIn() throws IOException, InterruptedException {
        login.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        menu.pressOnMenuButton();
        loginAssert.assertUser();

    }


    @org.junit.Test
    public void accountRemove() throws IOException, InterruptedException{
        login.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        menu.pressOnMenuButton();
        menu.pressOnSettingsAccount();
        settings.pressOnAccount();
        account.pressOnRemoveAccountButton();
        account.pressOnBackButton();
        removeAssert.removeUser();

    }

    @org.junit.Test
    public void messageSend() throws IOException, InterruptedException{
        login.loginYahoo("test.test599@yahoo.com","fatestyahoo100");
        fab.pressOnFabButton();
        fab.pressOnComposeButton();
        sendMessage.writeMessage("Barev axper");
        Thread.sleep(2000);
        sendMessage.writeTo("levMik94@yahoo.com");
        Thread.sleep(2000);
        sendMessage.writeSubject("Barev");
        sendMessage.pressOnSendButton();
        Thread.sleep(7000);
        menu.pressOnMenuButton();
        Thread.sleep(5000);
        menu.pressOnAddAccount();
        login.loginYahoo("levMik94@yahoo.com","Makardak123");
        inbox.pressOnInbox();
        inbox.getMessageSenderName();
        messageAssert.assertMessage();
    }


  /*  @After
    public void after(){
        p1.destroy();
        driver.quit();
    }*/

}
