package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLoadHelper {
    public static void waitForPageLoad(WebDriver driver, Duration timeInSecnds ){
        WebDriverWait wait = new WebDriverWait(driver,timeInSecnds);
        wait.until((ExpectedCondition<Boolean>) wd->
            ((JavascriptExecutor)wd).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitForElementVisibility(WebElement element,WebDriver driver, Duration timeInSecnds ){
        WebDriverWait wait= new WebDriverWait(driver,timeInSecnds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
