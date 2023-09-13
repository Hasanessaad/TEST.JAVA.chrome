import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePo {
    protected static WebDriver driver;
    protected static WebDriver chrome;

    public static void BasePO() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, chrome);
    }
}
