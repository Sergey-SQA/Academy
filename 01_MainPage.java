import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public WebDriver driver;

    private String url = "https://academymortgage.com/";

    MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToMainPage() {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void clickOnElement(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

}
