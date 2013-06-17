import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    public static final int TIME_OUT_IN_SECONDS = 5;
    static WebDriver webDriver;

    public static void openBrowser() {
        webDriver = new FirefoxDriver();
    }

    public static void closeBrowser() {
        webDriver.quit();
    }

    protected void WaitFor(By byCriteria) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, TIME_OUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byCriteria));

    }
}
