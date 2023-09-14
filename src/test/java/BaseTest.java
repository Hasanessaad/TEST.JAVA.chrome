import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class BaseTest {

    protected static WebDriver chrome;

    @BeforeClass
    public static void initiate(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("http://google.com");
    }
    @AfterClass
    public static void finalizer() {
        chrome.quit();
    }
}
