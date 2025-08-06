package Utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    // Thread-local variable to hold WebDriver per thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Getter for WebDriver
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Setter for WebDriver
    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    // Quit and clean up WebDriver
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Prevent memory leaks
        }
    }
}

