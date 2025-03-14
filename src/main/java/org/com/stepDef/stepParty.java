package org.com.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.Pages.partyPage;

public class stepParty {


    private partyPage PartyPage;
    public stepParty () {
        this.PartyPage = new partyPage();
    }



    @When("see logo social media click x-twitter")
    public void seeLogoSocialMediaClickXTwitter() {
        PartyPage.xTwitter();
    }



    @And("click facebook logo")
    public void clickFacebookLogo() {
        PartyPage.facebook();
    }



    @Then("click linkedin logo")
    public void clickLinkedinLogo() {
        PartyPage.linkedin();
    }
}
