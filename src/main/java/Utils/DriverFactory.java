package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import java.nio.file.Path;
import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver;
    public static void initializeDriver() {
        String browser = ConfigReader.getProperty("browser");
        initialiseBrowser(browser);
    }

    public static WebDriver initialiseBrowser(String browserName) {

        try {
            switch (browserName.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver","src/test/resources/driverExes/msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        }
        catch (WebDriverManagerException e){
            System.err.println("Failed to download " + browserName + " driver. Falling back to Chrome.");
            e.printStackTrace();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverManager.setDriver(driver);
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
