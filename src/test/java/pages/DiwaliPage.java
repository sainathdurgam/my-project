package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;

public class DiwaliPage {
    By diwaliImageE=By.xpath("//img[@src='https://d1tgh8fmlzexmh.cloudfront.net/ccbp-static-website/diwali-img.png']");
    By head=By.xpath("//h1[@class='diwali-top-section-heading']");
    By cardName=By.xpath("//h1[@class='diwali-card-name']");
    By cardPrice=By.xpath("//p[@class='diwali-card-price']");
    By btnE=By.xpath("//button");
    By imgE=By.xpath("//img[@class='software-developer-image']");

    WebDriver driver;
    WebDriverWait wait;
    public DiwaliPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement diwaliImage(){
        return driver.findElement(diwaliImageE);
    }

    public int itemSize(){
        return driver.findElements(cardName).size();
    }

    public String cardNames(int i){
        return driver.findElements(cardName).get(i).getText();
    }
    public String cardPrice(int j){
        return driver.findElements(cardPrice).get(j).getText();
    }
    public String cardHead(){
        return driver.findElement(head).getText();
    }
    public void button(){

         driver.findElement(btnE).click();
    }
    public WebElement image(){
        return driver.findElement(imgE);
    }

}
