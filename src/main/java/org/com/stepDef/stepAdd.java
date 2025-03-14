package org.com.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.com.Pages.addProductPage;

public class stepAdd {

    private addProductPage AddProductPage;

    public stepAdd () {
        this.AddProductPage = new addProductPage();
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
