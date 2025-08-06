import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateProfile {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        try{
            driver.get("https://www.naukri.com/");
            WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
            loginBtn.click();
//            Assert.assertTrue("Page displayed is not landing page",loginLabel.getText().equals("Login"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            WebElement otp = driver.findElement(By.xpath("//label[text()='Email ID / Username']/following-sibling::input"));
            otp.sendKeys("radha.janagouda@gmail.com");
            WebElement otpMobile = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
            otpMobile.sendKeys("Janagouda@1986");

            WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
            LoginBtn.click();

            WebElement naukriUpdate = driver.findElement(By.xpath("(//img[contains(@href,'naukri')])[1]"));
            Assert.assertEquals("The label is not correct",naukriUpdate.getText(),"naukri");

            WebElement Completeprofile = driver.findElement(By.xpath("(//a[@href='/mnjuser/profile'])[1]"));
            Completeprofile.click();

            WebElement resumeUpdate = driver.findElement(By.xpath("//input[@value='Update resume']"));
            resumeUpdate.click();
        }
        catch (Exception e){
            e.printStackTrace();
            driver.close();
        }
    }
}
