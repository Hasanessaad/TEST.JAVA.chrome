import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RouteTest extends BasePo{


    @BeforeClass
    public static void initiate(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("http://google.com");
    }

    @Test
    public void chromeTester() {
        chrome.findElement(By.name("q")).sendKeys("big mama"+ Keys.ENTER);
        String data = chrome.findElement(By.id("result-stats")).getText();
        Assert.assertTrue(data.contains("Aproximadamente"));
    }

    @AfterClass
    public static void finalizer() {
        chrome.quit();
    }
}
