import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePo extends BasePo{
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(id = "result-stats")
    private WebElement searchResultStats;

    public void searchFor(String query) {
        searchBox.sendKeys(query + Keys.ENTER);
    }

    public String getSearchResultStatsText() {
        return searchResultStats.getText();
    }
}
