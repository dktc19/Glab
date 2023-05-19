package pages_object.login;

import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.WebElementActionUtil.*;

public class ActionsLogin extends ElementsLogin{
    WebDriverWait wait = new WebDriverWait(driver,3000 );
    public void userLogin(){
        clickEl(wait,button_userLogin);
        enterText(wait,field_email,"kietht@glab.vn");
        enterText(wait,field_password,"Kietht@123");
        clickEl(wait,button_Login);
    }
    public String getTextNameLogin(){
        System.out.println(getTextElement(wait,text_userName));
        return getTextElement(wait,text_userName);
    }
}
