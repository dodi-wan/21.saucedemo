package org.com.stepdef.stepadd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.com.pages.addpage.AddProductPage;

public class StepAdd {

    private org.com.pages.addpage.AddProductPage AddProductPage;

    public StepAdd() {
        this.AddProductPage = new AddProductPage();
    }



    @And("click product")
    public void clickProduct() {
        AddProductPage.backPack();
        AddProductPage.bikeLight();
        AddProductPage.jacket();
        AddProductPage.tShirt();
        AddProductPage.babyTshirt();
        AddProductPage.longTshirt();
    }



    @When("see product at shopping cart")
    public void seeProductAtShoppingCart() {
        AddProductPage.shoppingCart();
    }
}
