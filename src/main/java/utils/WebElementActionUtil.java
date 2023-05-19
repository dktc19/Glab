package utils;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebElementActionUtil {
    public static void clickEl(WebDriverWait wait, Query q) {
        WebElement myElement = wait.until(ExpectedConditions.elementToBeClickable(q.by()));
        myElement.click();
    }
    public static void  enterText(WebDriverWait wait,Query q, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(q.by()));
        q.findWebElement().sendKeys(value);
    }
    public static String getTextElement(WebDriverWait wait, Query q) {
        WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(q.by()));
        return myElement.getText();
    }
    public static Boolean isElementVisible(WebDriverWait wait, Query q) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(q.by()));
            q.findWebElement();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
        } catch (TimeoutException e) {
        }
        return false;
    }
    public static Boolean matchFound(String patternValue, String value) {
        Pattern pattern = Pattern.compile(patternValue);
        Matcher matcher = pattern.matcher(value);
        System.out.println(pattern);
        System.out.println(value);
        return matcher.find();
    }
    public static void clearInput(WebDriverWait wait, Query q) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(q.findWebElement()));
        element.clear();
    }
    public static Boolean isLoadingImage(WebElement element) {
        WebDriver driver = ((RemoteWebElement)element).getWrappedDriver();
        return (Boolean) ((JavascriptExecutor)driver).executeScript(
                "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", element);
    }
}
