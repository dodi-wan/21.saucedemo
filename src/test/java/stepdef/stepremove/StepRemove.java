package stepdef.stepremove;

import io.cucumber.java.en.Then;
import org.com.pages.removepage.RemovePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepRemove {


    RemovePage removePage;
    public StepRemove() {
        removePage = new RemovePage();
    }


    @Then("click remove product")
    public void clickRemoveProduct() {
        removePage.removeBackPack();
        removePage.removeBikeLight();
        removePage.removeBoltTshirt();
        removePage.removeFleceeJacket();
        removePage.removeBabyTshirt();
        removePage.removeLongTshirt();
    }



    @Then("validate has been remove")
    public void validateHasBeenRemove() {
        String removeBackPack = removePage.getRemoveBackPack();
        assertEquals("Add to cart", removeBackPack);

        System.out.println("Result \n" + removeBackPack);

    }
}
