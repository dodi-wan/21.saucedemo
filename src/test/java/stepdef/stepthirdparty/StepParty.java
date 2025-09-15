package stepdef.stepthirdparty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.thirdpartypage.PartyPage;

import static org.com.helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepParty {

    private PartyPage partyPage;
    private String trueWindow;

    public StepParty() {
        partyPage = new PartyPage();
    }


    @When("see logo social media click x-twitter")
    public void seeLogoSocialMediaClickXTwitter() {
        trueWindow = driver.getWindowHandle();
        partyPage.xTwitter();

        //switch window
        for (String windowTwitter : driver.getWindowHandles()){
            if(!windowTwitter.equals(trueWindow)){
                driver.switchTo().window(windowTwitter);
                break;
            }
        }
    }


    @Then("verify homepage twitter")
    public void verifyHomepageTwitter() {
        String validateTitle = partyPage.validateTwitter();
        assertEquals("Don’t miss what’s happening", validateTitle);
        System.out.println("Result ===" + validateTitle + "===");
    }


    @And("click facebook logo")
    public void clickFacebookLogo() {
        trueWindow = driver.getWindowHandle();
        partyPage.facebook();

        for (String windowFacebook : driver.getWindowHandles()) {
            if (!windowFacebook.equals(trueWindow)) {
                driver.switchTo().window(windowFacebook);
                break;
            }
        }
    }


    @Then("verify homepage facebook")
    public void verifyHomepageFacebook() {
    String validateTitle = partyPage.validateFacebook();

    assertEquals("See more from Sauce Labs", validateTitle);
    System.out.println("Result === " + validateTitle + " ===");
    }


    @When("click linkedin logo")
    public void clickLinkedinLogo() {
        trueWindow = driver.getWindowHandle();
        partyPage.linkedin();

        for(String windowLinkedin : driver.getWindowHandles()){
            if(!windowLinkedin.equals(trueWindow)){
                driver.switchTo().window(windowLinkedin);
                break;
            }
        }
    }


    @Then("validate homepage linkedin")
    public void validateHomepageLinkedin() {
        boolean validateStoreLinkedin = partyPage.storeLinkedin();
        boolean validateTitle = partyPage.validateLinkedin();
        boolean validateAppLinkedin = partyPage.appLinkedin();


        assertTrue(validateStoreLinkedin, "Don’t have the app? Get it in the Microsoft Store.");
        assertTrue(validateTitle, "LinkedIn is better on the app");
        assertTrue(validateAppLinkedin, "Open the app");

        System.out.println("Result === " + validateStoreLinkedin + " ===");
        System.out.println("Result === " + validateTitle + " ===");
        System.out.println("Result === " + validateAppLinkedin + " ===");
    }
}
