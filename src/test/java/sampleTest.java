import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class sampleTest {

    @Test
    public void loginWithValidCredentials() {
        // Set the system property for Chrome driver with its path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://rahulnxttrendz.ccbp.tech/login");

        // Locate the username input field element by its id
        WebElement usernameEl = driver.findElement(By.id("username"));
        usernameEl.sendKeys("rahul");

        // Locate the password input field element by its id
        WebElement passwordEl = driver.findElement(By.id("password"));
        passwordEl.sendKeys("rahul@2021");

        // Find the login button element by its class name
        WebElement loginButtonEl = driver.findElement(By.className("login-button"));

        // Submit the login form
        loginButtonEl.submit();

        // Declare expected URL
        String expectedUrl = "https://rahulnxttrendz.ccbp.tech/";

        // Wait for the page to be redirected to the expected URL
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        // Get the current URL
        String currentUrl = driver.getCurrentUrl();
        driver.quit();

    }
}
