package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    By logoImage=By.xpath("//img[@class='software-developer-image']");
    By headE=By.xpath("//h1");
    By paraE=By.xpath("//p");

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement softwareImage(){
        return driver.findElement(logoImage);
    }
    public String head(){
        return driver.findElement(headE).getText();
    }
    public String para(){
        return driver.findElement(paraE).getText();
    }


}
