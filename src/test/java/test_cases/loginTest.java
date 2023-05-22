package test_cases;

import base_Setup.baseSetup;
import org.testng.annotations.Test;
import pages_object.login.ActionsLogin;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class loginTest extends baseSetup {
    public ActionsLogin actionsLogin;
    public static void sleepTo(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void abc(){
        sleepTo(1000);
        driver.close();
    }
    @Test
    public void userLogin() throws IOException {
        actionsLogin = new ActionsLogin();
        actionsLogin.userLogin();
        sleepTo(1000);
        assertThat(actionsLogin.getTextNameLogin()).isEqualTo("Hà Tuấn Kiệt");

    }
}
