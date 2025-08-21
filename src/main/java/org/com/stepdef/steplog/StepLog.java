package org.com.stepdef.steplog;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.com.pages.LoginPage;


public class StepLog {

   private org.com.pages.LoginPage loginPage;

   public StepLog() {
        loginPage =new LoginPage();
    }


    @And("input {string} and {string}")
    public void inputAnd(String username, String password) {
        loginPage.userName(username);
        loginPage.password(password);
    }


    @Then("click button login")
    public void clickButtonLogin() {
        loginPage.buttonLogin();
    }

    @Given("message {string}")
    public void message(String error_message) {
        loginPage.message_button(error_message);
    }
}
