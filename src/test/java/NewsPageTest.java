import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import pages.*;


public class NewsPageTest {
    public WebDriver driver;
    NewsPage newsPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");
        newsPage= new NewsPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public  void  newsPaper(){
        newsPage.paperClick();
        Assert.assertEquals(newsPage.para1(),"NEWS OF THE DAY");
        Assert.assertEquals(newsPage.head(),"All educational institutions in Assam to reopen from November 2");
        Assert.assertEquals(newsPage.para2(),"Uttar Pradesh's Gautam Buddh Nagar recorded 107 new Covid-19 cases on Saturday, pushing the district's infection tally to 15,803, official data showed. The number of active cases came down further to 1,384 from 1,477 on Friday and 1,523 on Thursday, according to the data released by the UP Health Department for a 24-hour period.","para2 not matched");
        Assert.assertEquals(newsPage.btText(),"Read more");
        newsPage.back();
        Assert.assertTrue(newsPage.logo().isDisplayed(),"logo not display");
    }
}
