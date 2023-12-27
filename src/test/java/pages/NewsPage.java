package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NewsPage {
    By softwareLogo=By.xpath("//img[@class='software-developer-image']");
    By paperImageE=By.xpath("//img[@src='https://d1tgh8fmlzexmh.cloudfront.net/ccbp-static-website/news-paper-img.png']");
    By paperPara1=By.xpath("//p[@class='news-category']");
    By paper2=By.xpath("//p[@class='news-description']");
    By paperHeadE=By.xpath("//h1");
    By brnText=By.xpath("//button[@class='news-button']");
    By btnClick=By.xpath("//button[@class='btn btn-primary']");


    WebDriver driver;
    WebDriverWait wait;
    public NewsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public WebElement logo(){
        return driver.findElement(softwareLogo);
    }

    public void paperClick(){
        driver.findElement(paperImageE).click();
    }
    public String para1(){
        return  driver.findElement(paperPara1).getText();
    }
    public String para2(){
        return  driver.findElement(paper2).getText();
    }
    public String head(){
        return  driver.findElement(paperHeadE).getText();
    }
    public String btText(){
        return  driver.findElement(brnText).getText();
    }
    public void back(){
        driver.findElement(btnClick).click();
    }


}
