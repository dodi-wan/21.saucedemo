package stepdef.stepbva;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.addpage.AddProductPage;
import org.com.pages.bvapage.BvaPage;

public class StepBva {

    BvaPage bvaPage;

    public StepBva() {
        bvaPage = new BvaPage();
    }



    @When("click shopping cart")
    public void clickShoppingCart() {
        bvaPage.clickShopCart();
    }



    @Then("validate BVA")
    public void validateBVA() {

    }


}
