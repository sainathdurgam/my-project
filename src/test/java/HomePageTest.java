import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

import pages.*;


public class HomePageTest {
    public WebDriver driver;
    HomePage homePage;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void homePageUi(){
        Assert.assertTrue(homePage.softwareImage().isDisplayed(),"logo image not display");
        Assert.assertEquals(homePage.head(),"My Projects");
        Assert.assertEquals(homePage.para(),"These are a few of my Static Website projects that I have developed using HTML, CSS and Bootstrap");
    }


}
