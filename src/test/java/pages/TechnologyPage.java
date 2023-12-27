package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class TechnologyPage {

    By techImage=By.xpath("//img[@src='https://d1tgh8fmlzexmh.cloudfront.net/ccbp-static-website/advanced-technologies-img.png']");
    By techHeadE=By.xpath("//h1");
    By techParaE=By.xpath("//p");
    By learmoreE=By.xpath("//button[@class='advanced-technologies-learn-more-button']");
    By buttonE=By.xpath("//button[2]");
    By imgE=By.xpath("//img[@class='software-developer-image']");

    WebDriver driver;
    WebDriverWait wait;
    public TechnologyPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement imageClick(){
         return  driver.findElement(techImage);
    }
    public String head(){
        return  driver.findElement(techHeadE).getText();
    }
    public String para(){
        return  driver.findElement(techParaE).getText();
    }
    public String btnText(){
        return  driver.findElement(learmoreE).getText();
    }
    public WebElement btnClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonE));
        return driver.findElement(buttonE);
    }
    public WebElement img(){
        return  driver.findElement(imgE);
    }

}
