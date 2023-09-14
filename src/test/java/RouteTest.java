import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class RouteTest extends BaseTest {
    @Test
    public void chromeTester() {
        chrome.findElement(By.name("q")).sendKeys("big mama"+ Keys.ENTER);
        String data = chrome.findElement(By.id("result-stats")).getText();
        Assert.assertTrue(data.contains("Aproximadamente"));
    }
}
