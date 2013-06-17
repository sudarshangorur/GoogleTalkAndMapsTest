import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestCaseHelper {

    @BeforeClass
    public static void openBrowser() {
        Browser.openBrowser();
    }

    @AfterClass
    public static void closeBrowser() {
        Browser.closeBrowser();
    }
}
