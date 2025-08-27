package org.com.stepdef.stepremove;

import io.cucumber.java.en.Then;
import org.com.pages.removepage.RemovePage;

public class StepRemove {


    private org.com.pages.removepage.RemovePage RemovePage;
    public StepRemove() {
        this.RemovePage = new RemovePage();
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
