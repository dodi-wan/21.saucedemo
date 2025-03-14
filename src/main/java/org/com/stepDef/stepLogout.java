package org.com.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.com.Pages.logoutPage;

public class stepLogout {



    private logoutPage LogoutPage;
    public stepLogout () {
        this.LogoutPage =new logoutPage();
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
