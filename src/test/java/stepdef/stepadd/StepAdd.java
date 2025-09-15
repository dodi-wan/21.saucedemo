package stepdef.stepadd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.com.pages.addpage.AddProductPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepAdd {

    private AddProductPage addProductPage;

    public StepAdd() {
        addProductPage = new AddProductPage();
    }


    @And("click product")
    public void clickProduct() {
        addProductPage.backPack();
        addProductPage.bikeLight();
        addProductPage.jacket();
        addProductPage.tShirt();
        addProductPage.babyTshirt();
        addProductPage.longTshirt();
    }


    @When("see product at shopping cart")
    public void seeProductAtShoppingCart() {
        assertEquals("6", addProductPage.shoppingCart());
        assertEquals("Remove", addProductPage.validateRemove());
    }
}
