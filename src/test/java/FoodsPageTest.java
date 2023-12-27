import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import pages.*;

public class FoodsPageTest {
    public WebDriver driver;
    FoodsPage foodsPage;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        foodsPage= new FoodsPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void foodPage(){
        foodsPage.foodImage();
        Assert.assertEquals(foodsPage.head(),"Happy Meals","food head not found");
        Assert.assertEquals(foodsPage.para(),"Discover the best foods over the 1,000 restaurants","food para not found");
        Assert.assertEquals(foodsPage.btnText(),"Book Now","btn text not found");
        foodsPage.back();
        Assert.assertTrue(foodsPage.logo().isDisplayed(),"logo not display");
    }

}
