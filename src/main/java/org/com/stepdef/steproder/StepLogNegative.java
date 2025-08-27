package org.com.stepdef.steproder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.com.pages.addpage.AddProductPage;
import org.com.pages.orderpage.OrderPage;

public class StepLogNegative {

    private AddProductPage addProductPage;
    private OrderPage checkoutPage;


    public StepLogNegative(){
        this.addProductPage = new AddProductPage();
        this.checkoutPage = new OrderPage();
    }


    @And("click add to cart {string}")
    public void clickAddToCart(String backPack) {
        addProductPage.backPack();
    }


    @And("the checkout button  is showed, click it")
    public void theCheckoutButtonIsShowedClickIt() {
        checkoutPage.yourCart();
    }



    @And("the text First Name {string} Last Name {string} Postal Code {string} is showed input it")
    public void theTextFirstNameLastNamePostalCodeIsShowedInputIt(String firstname, String lastname, String postalcode) {
        checkoutPage.firstName(firstname);
        checkoutPage.lastName(lastname);
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

