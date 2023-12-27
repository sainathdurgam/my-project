import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import pages.*;

public class TechnologyPageTest {
    public WebDriver driver;
    TechnologyPage technologyPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        technologyPage= new TechnologyPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void TechUi(){
        technologyPage.imageClick().click();
        Assert.assertEquals(technologyPage.head(),"Advanced Technologies","tech heading not match");
        Assert.assertEquals(technologyPage.para(),"Machinery and equipment developed from the application of scientific knowledge.","tech para not match");
        Assert.assertEquals(technologyPage.btnText(),"Learn more");
        technologyPage.btnClick().click();
        Assert.assertTrue(technologyPage.img().isDisplayed(),"softwareLogo not displayed");

    }
}
