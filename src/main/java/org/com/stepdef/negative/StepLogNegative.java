package org.com.stepdef.negative;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.com.pages.AddProductPage;
import org.com.pages.negative.CheckoutPage;

public class StepLogNegative {

    private org.com.pages.AddProductPage addProductPage;
    private CheckoutPage checkoutPage;


    public StepLogNegative(){
        this.addProductPage = new AddProductPage();
        this.checkoutPage = new CheckoutPage();
    }


    @And("click add to cart {string}")
    public void clickAddToCart(String backPack) {
        addProductPage.backPack();
    }


    @And("the checkout button  is showed, click it")
    public void theCheckoutButtonIsShowedClickIt() {
        checkoutPage.yourCart();
    }


    @And("the text First Name Last Name Postal Code {string} is showed input it")
    public void theTextFirstNameLastNamePostalCodeIsShowedInputIt(String postalcode) {
        checkoutPage.firstName();
        checkoutPage.lastName();
        checkoutPage.postalCode(postalcode);
    }


    @Then("click continue button")
    public void clickContinueButton() {
        checkoutPage.continueCheckout();

    }


    @And("click shop cart")
    public void clickShopCart() {
        addProductPage.shoppingCart();
    }

    @And("click remove it")
    public void clickRemoveIt() {
        checkoutPage.removeProduct();
    }

    @And("click finish button")
    public void clickFinishButton() {
        checkoutPage.finishButton();
    }

    @Then("the result is showed text {string}")
    public void theResultIsShowedText(String finish) {
        checkoutPage.finishOrder();
    }
}

