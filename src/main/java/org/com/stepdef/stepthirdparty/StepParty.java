package org.com.stepdef.stepthirdparty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.thirdpartypage.PartyPage;

public class StepParty {


    private org.com.pages.thirdpartypage.PartyPage PartyPage;
    public StepParty() {
        this.PartyPage = new PartyPage();
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
