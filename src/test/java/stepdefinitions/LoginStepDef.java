package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigurationsReader;
import utilities.Driver;

import java.lang.module.Configuration;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user enter click login page")
    public void user_enter_click_login_page() {
        Driver.getDriver().get(ConfigurationsReader.getProperty("app_url"));
        loginPage.login.click();
    }

    @When("user enter email address")
    public void user_enter_email_address() {
        loginPage.email.sendKeys("customer@bluerentalcars.com");
    }

    @When("user enter password")
    public void user_enter_password() {
    loginPage.password.sendKeys("12345");
    }

    @Then("click login accses")
    public void click_login_accses() {
    loginPage.loginsubmit.click();
    }
}
