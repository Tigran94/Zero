import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by admin on 1/13/17.
 */
public class Test {
    Process p,p1;
    WebDriver driver;
    @Before
    public void before() throws IOException, InterruptedException {
        String userDir = System.getProperties().get("user.dir").toString();
        openCurEmul();
        openTerminal();


        DesiredCapabilities caps= new DesiredCapabilities();
        caps.setCapability("deviceName","Nexus_5X_API_19");
        caps.setCapability("platformName","Android");
        caps.setCapability("appActivity",".accounts.AddAccountActivity");
        caps.setCapability("app",userDir+"/zero.apk");

        driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }

    public void openTerminal() throws IOException, InterruptedException {
        String osName = System.getProperties().getProperty("os.name");

        if (osName.equals("Mac OS X")) {
            String command = "/usr/bin/open -a Terminal /Users/admin/Desktop/do.bash";
            p=Runtime.getRuntime().exec(command);
            Thread.sleep(80000);
        }
        else if(osName.equals("Windows 7")){
            String[] cmd = {"C:\\WINDOWS\\system32\\cmd.exe","/c","start","c:\\Users\\HP\\Desktop\\Zero.bat"};
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(cmd);
        }
    }

    public void openCurEmul() throws IOException {
        String command1="emulator -avd Nexus_5X_API_19";
        p1=Runtime.getRuntime().exec(command1);
    }
    @org.junit.Test
    public void setUp() throws IOException, InterruptedException {

        driver.findElements(By.id("mail.zero.com.zeromail:id/add_account_logo")).get(0).click();

    }
    @After
    public void after(){
        p1.destroy();
       // driver.quit();
    }

}
