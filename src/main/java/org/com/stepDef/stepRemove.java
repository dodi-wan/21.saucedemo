package org.com.stepDef;

import io.cucumber.java.en.Then;
import org.com.Pages.removePage;

public class stepRemove {


    private removePage RemovePage;
    public stepRemove() {
        this.RemovePage = new removePage();
    }


    @Then("click remove product")
    public void clickRemoveProduct() {
        RemovePage.removeBackPack();
        RemovePage.removeBikeLight();
        RemovePage.removeBoltTshirt();
        RemovePage.removeFleceeJacket();
        RemovePage.removeBabyTshirt();
        RemovePage.removeLongTshirt();
    }
}
