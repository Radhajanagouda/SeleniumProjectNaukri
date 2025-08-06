package com.rj.cucumber.RJSteps;

import Utils.DriverManager;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
public class StepDefs {
    WebDriver driver = DriverManager.getDriver();
    LoginPage lp = new LoginPage(driver);

    @Given("Login to naukri with below user {string}")
    public void login_to_naukri_with_below_user(String User) throws InterruptedException {
        lp.enterLoginDetails(User);
    }
    @Then("landing page is got as {string}")
    public void landing_page_is_got_as(String string) throws InterruptedException {
        lp.validateLandingPage();
    }

    @Then("Logout the page")
    public void logoutThePage() {
        lp.validateLogoutAction();
    }
}
