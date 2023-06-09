package base_Setup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static CommonData.Common.*;


public class baseSetup {
    protected static RemoteWebDriver driver;
    //    private static final String srcDir = System.getProperty("user.dir") + "/src\\main\\resources/";
    String driverPath = "D:\\seleniumChrome\\chromedriver.exe";



    @BeforeSuite
    public void openDriverObject(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeDriverObject(){
        driver.close();
    }

}
