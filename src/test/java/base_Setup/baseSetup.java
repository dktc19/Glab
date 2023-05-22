package base_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.PropertiesFile;

import java.util.concurrent.TimeUnit;


public class baseSetup {
    protected static RemoteWebDriver driver;
    public String baseUrl = "https://glab-v2.khgc.dev/";
    //    private static final String srcDir = System.getProperty("user.dir") + "/src\\main\\resources/";
    String driverPath = "D:\\seleniumChrome\\chromedriver.exe";



    @BeforeSuite
    public void openDriverObject(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Gọi hàm để khởi tạo file properties
        PropertiesFile.setPropertiesFile();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(PropertiesFile.getPropValue("url_Glab"));
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeDriverObject(){
        driver.close();
    }

}
