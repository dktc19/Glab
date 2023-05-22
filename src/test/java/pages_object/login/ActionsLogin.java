package pages_object.login;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertiesFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static utils.WebElementActionUtil.*;

public class ActionsLogin extends ElementsLogin{
    private static final String srcDir = System.getProperty("user.dir") + "/src\\test\\java\\ImgScreenShot\\";
    WebDriverWait wait = new WebDriverWait(driver,3000 );
    public void userLogin(){
        clickEl(wait,button_userLogin);
        //Set giá trị vào file properties
        PropertiesFile.setPropValue("email", "kietht@glab.vn");
        // Đọc data từ file properties
        enterText(wait,field_email, PropertiesFile.getPropValue("email"));
        enterText(wait,field_password,PropertiesFile.getPropValue("password"));
        clickEl(wait,button_Login);
    }
    public String getTextNameLogin(){
        return getTextElement(wait,text_userName);
    }
    public void screenShot() throws IOException {
        int realtime = (int) new Date().getTime();
        String nameIMG = "GLAB";
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File LinkImg = new File(srcDir + nameIMG+ realtime + ".png");
        FileUtils.copyFile(SrcFile, LinkImg);
    }
}
