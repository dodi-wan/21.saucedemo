package stepdef.steplogout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.logoutpage.LogoutPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepLogout {

    private LogoutPage logoutPage;

    public StepLogout() {
        logoutPage = new LogoutPage();
    }


    @And("verify on homepage")
    public void verifyOnHomepage() {
        logoutPage.validate_login();
    }


    @When("click menu")
    public void clickMenu() {
        logoutPage.menu_bar();
    }



    @And("click logout button")
    public void clickLogoutButton() {
        logoutPage.logoutButton();
    }



    @Then("Verify already logout")
    public void verifyAlreadyLogout() {
        String actualListUser = logoutPage.listUser();
        String actualPassword = logoutPage.listPassword();
        String actualTitle = logoutPage.titleSwagLabs();

        assertEquals("Accepted usernames are:", actualListUser);
        assertEquals("Password for all users:", actualPassword);
        assertEquals("Swag Labs", actualTitle);

        System.out.println("Result === " + actualListUser + " ===");
        System.out.println("Result === " + actualPassword + " ===");
        System.out.println("Result === " + actualTitle + " ===");
    }
}
