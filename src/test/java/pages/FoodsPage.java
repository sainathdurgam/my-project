package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FoodsPage {

    By softwareLogo=By.xpath("//img[@class='software-developer-image']");
    By foodPageE=By.xpath("//img[@src='https://d1tgh8fmlzexmh.cloudfront.net/ccbp-static-website/food-img.png']");
    By headE=By.xpath("//h1");
    By paraE=By.xpath("//p");
    By btnTextE=By.xpath("//button[@class='order-card-button']");
    By btn2=By.xpath("//button[@class='btn btn-primary']");

    WebDriver driver;
    WebDriverWait wait;
    public FoodsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void foodImage(){
        driver.findElement(foodPageE).click();
    }
    public String head(){
        return driver.findElement(headE).getText();
    }
    public String para(){
        return driver.findElement(paraE).getText();
    }
    public String btnText(){
        return driver.findElement(btnTextE).getText();
    }
    public void back(){
        driver.findElement(btn2).click();
    }
    public WebElement logo(){
        return driver.findElement(softwareLogo);
    }




}
