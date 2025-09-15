package stepdef.steproder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.com.pages.addpage.AddProductPage;
import org.com.pages.loginpage.LoginPage;
import org.com.pages.orderpage.OrderPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepLogNegative {

    private AddProductPage addProductPage;
    private OrderPage checkoutPage;
    private LoginPage loginPage;


    public StepLogNegative(){
        addProductPage = new AddProductPage();
        checkoutPage = new OrderPage();
        loginPage = new LoginPage();
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


    @And("click continue button")
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
    public void theResultIsShowedText(String expectedMessage) {
        String actualFirstMessage = checkoutPage.finishOrder(expectedMessage);

        assertEquals(expectedMessage, actualFirstMessage);
        System.out.println("Result \n" + actualFirstMessage + "\n");
    }


    @Then("validate BVA {string}")
    public void validateBVA(String expectedMessage) {
        String actualMessage = loginPage.validateMessageBva();
        assertEquals(expectedMessage, actualMessage, "Failed message");
        System.out.println(actualMessage);
    }
}

