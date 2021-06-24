import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {

        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers win/chromedriver.exe");

        driver = new ChromeDriver();

    }

}
