package org.com.stepdef.stepfilter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.FilterPage;

public class StepFilter {



    private org.com.pages.FilterPage FilterPage;
    public StepFilter() {
        this.FilterPage = new FilterPage();
    }



    @And("click filter product")
    public void clickFilterProduct() {
        FilterPage.filter();
    }


    @When("see new mini window click name \\(A to Z)")
    public void seeNewMiniWindowClickNameAToZ() {
        FilterPage.filterNameAZ();
    }


    @And("click name \\(Z to A)")
    public void clickNameZToA() {
        FilterPage.filterNameZA();
    }



    @And("click price \\(low to high)")
    public void clickPriceLowToHigh() {
        FilterPage.priceHighLow();
    }



    @Then("click price \\(high to low)")
    public void clickPriceHighToLow() {
        FilterPage.priceLowHigh();
    }
}
