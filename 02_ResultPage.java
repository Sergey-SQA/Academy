import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResultPage {

    WebDriver driver;

    ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyElIsThere(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        Assert.assertTrue(element.isDisplayed());
    }

    public void waitUntilElement(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public void verifyTextIsOnPage (String text) {
        boolean isTextThere = driver.getPageSource().contains(text);
        Assert.assertTrue(isTextThere);
    }

}
