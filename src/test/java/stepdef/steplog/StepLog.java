package stepdef.steplog;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.com.pages.loginpage.LoginPage;

import static org.junit.jupiter.api.Assertions.*;


public class StepLog {

   private LoginPage loginPage;

   public StepLog() {
        loginPage =new LoginPage();
    }



    @Given("input {string} and {string}")
    public void inputAnd(String username, String password) {
        loginPage.userName(username);
        loginPage.password(password);
    }



    @And("click button login")
    public void clickButtonLogin() {
        loginPage.buttonLogin();

    }



    @Given("message {string}")
    public void message(String messageExpectation) {
       String messageActual = loginPage.messageButton(messageExpectation);

       assertEquals(messageExpectation, messageActual);
       System.out.println("Result \n" + messageActual);
    }



    @Then("validate {string}")
    public void validate(String expectedMessage) {
        String actualMessage = loginPage.validateMessageBva();
        assertEquals(expectedMessage, actualMessage);
        System.out.println("Result === " + actualMessage + " ===");
    }



    @Then("verify login")
    public void verifyLogin() {
       assertEquals("Sauce Labs Backpack",  loginPage.validateBackPack());
       assertEquals("carry.allTheThings() with the sleek, streamlined Sly " +
               "Pack that melds uncompromising style with unequaled laptop and tablet protection.",
               loginPage.DescValidate());
       assertEquals("Products", loginPage.productValidate());
    }
}
