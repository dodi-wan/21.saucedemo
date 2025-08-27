package org.com.stepdef.steplogout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.com.pages.logoutpage.LogoutPage;

public class StepLogout {



    private org.com.pages.logoutpage.LogoutPage LogoutPage;
    public StepLogout() {
        this.LogoutPage =new LogoutPage();
    }



    @And("verify on homepage")
    public void verifyOnHomepage() {
        LogoutPage.validate_login();
    }


    @When("click menu")
    public void clickMenu() {
        LogoutPage.menu_bar();
    }


    @And("click logout button")
    public void clickLogoutButton() {
        LogoutPage.logoutButton();
    }
}
