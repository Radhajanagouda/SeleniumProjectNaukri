package pageObjects;

import Utils.PageLoadHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utils.CommonUtils;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get("https://www.naukri.com/mnjuser/homepage");
    }
    CommonUtils commonUtil = new CommonUtils();
//   @FindBy(id = "usernameField")
//    WebElement userName;
//   @FindBy(xpath = "//a[text()='Login']")
//    WebElement loginPage;

//   @FindBy(xpath = "//button[text()='Login']")
//   WebElement loginBtn;
//   @FindBy(id = "passwordField")
//    WebElement password;
//    @FindBy(id = "(//img[@href='https://www.naukri.com'])[1]")
//    WebElement naukriLabel;


   public void enterLoginDetails(String User) throws InterruptedException {
       String pwdFromJson = commonUtil.getPwdFromJson(User);
       Thread.sleep(1000);
       WebElement userName = driver.findElement(By.id("usernameField"));
       WebElement password = driver.findElement(By.id("passwordField"));
       WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));

       userName.sendKeys(User);
       password.sendKeys(pwdFromJson);
       loginBtn.click();
   }
   public void validateLandingPage(String loggin) throws InterruptedException {
       PageLoadHelper.waitForPageLoad(driver, Duration.ofSeconds(10));
       System.out.println(loggin);
       WebElement viewProfile = driver.findElement(By.xpath("//div/a[text()='View']"));
       PageLoadHelper.waitForElementVisibility(viewProfile,driver,Duration.ofSeconds(2));
       commonUtil.maximizeWindow();
//       Assert.assertTrue(viewProfile.isDisplayed());
   }

    public void validateLogoutAction(){
        WebElement logout = driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']"));
        logout.click();
        WebElement logoutBtn = driver.findElement(By.xpath("//a[@title='Logout']"));
        logoutBtn.click();
    }
}
