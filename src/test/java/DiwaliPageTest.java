import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import pages.*;

public class DiwaliPageTest {
    public WebDriver driver;
    DiwaliPage diwaliPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        diwaliPage= new DiwaliPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void diwaliUI(){
        diwaliPage.diwaliImage().click();

        Assert.assertEquals(diwaliPage.cardHead(),"Celebrate Diwali with your friends","heading not match");
        String[] arr1= {"Diwali Air Balloon", "Diwali - Lamp", "Sparklers", "Fire Cracker"};
        String[]arr2={"Rs 369", "Rs 50", "Rs 150", "Rs 560"};
        int number=diwaliPage.itemSize();
        for (int i=0;i<number;i++){
            Assert.assertEquals(diwaliPage.cardNames(i),arr1[i],"names not match");
            Assert.assertEquals(diwaliPage.cardPrice(i),arr2[i],"price not match");
        }
        diwaliPage.button();
        Assert.assertTrue(diwaliPage.image().isDisplayed(),"softImage is not display");

    }
}
