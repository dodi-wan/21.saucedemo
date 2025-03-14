package org.com.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.com.Pages.loginPage;

import static org.com.helper.utility.driver;


public class stepLog {

   private loginPage LoginPage;
   public stepLog() {
        this.LoginPage =new loginPage();
    }


    @Given("url sauce demo")
    public void urlSauceDemo() {
        LoginPage.url();
    }


    @And("input {string} and {string}")
    public void inputAnd(String username, String password) {
        LoginPage.userName(username);
        LoginPage.password(password);
    }


    @Then("click button login")
    public void clickButtonLogin() {
        LoginPage.buttonLogin();
    }

    @Given("message {string}")
    public void message(String error_message) {
        LoginPage.message_button(error_message);
    }
}
