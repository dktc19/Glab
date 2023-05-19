package pages_object.login;

import base_Setup.baseSetup;
import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;

public class ElementsLogin extends baseSetup {
    public Query demo = new Query().defaultLocator(By.xpath("")).usingDriver(driver);
    public Query button_userLogin = new Query().defaultLocator(By.xpath("//a[4]//i[@class='far fa-user fs-16']")).usingDriver(driver);
    public Query field_email = new Query().defaultLocator(By.xpath("//input[@id='emailInput']")).usingDriver(driver);
    public Query field_password = new Query().defaultLocator(By.xpath("//input[@id='passwordInput']")).usingDriver(driver);
    public Query button_Login = new Query().defaultLocator(By.xpath("//button[contains(text(),'Đăng Nhập')]")).usingDriver(driver);
    public Query text_userName = new Query().defaultLocator(By.xpath("//a[@class='nav-link px-3 d-none d-lg-block']")).usingDriver(driver);
}
