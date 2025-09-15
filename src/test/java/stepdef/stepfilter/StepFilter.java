package stepdef.stepfilter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.com.pages.filterpage.FilterPage;
import org.com.pages.loginpage.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepFilter {

    FilterPage filterPage;
    LoginPage loginPage;


    public StepFilter() {
        filterPage = new FilterPage();
        loginPage = new LoginPage();
    }



    @And("click filter product")
    public void clickFilterProduct() {
        filterPage.filter();
    }



    @When("see new mini window click name \\(A to Z)")
    public void seeNewMiniWindowClickNameAToZ() {
        filterPage.filterNameAZ();
    }



    @Then("validate filter name")
    public void validateFilterName() {
        String validateName = filterPage.validateAz();
        String validateFirstProduct = loginPage.validateBackPack();
        String validateLastProduct = filterPage.validateSortAz();

        assertEquals("Name (A to Z)", validateName);
        assertEquals("Sauce Labs Backpack",  loginPage.validateBackPack());
        assertEquals("Test.allTheThings() T-Shirt (Red)",  filterPage.validateSortAz());

        System.out.println("result ==== " +validateName+ " ===");
        System.out.println("result ==== " +validateFirstProduct+ " ===");
        System.out.println("result ==== " +validateLastProduct+ " ===");
    }



    @And("click name \\(Z to A)")
    public void clickNameZToA() {
        filterPage.filterNameZA();
    }



    @Then("validate filter name Z to A")
    public void validateFilterNameZToA() {
        String validateName = filterPage.validateZa();
        String validateFirstProduct = filterPage.validateSortAz();
        String validateLastProduct = loginPage.validateBackPack();

        assertEquals("Name (Z to A)", validateName);
        assertEquals("Test.allTheThings() T-Shirt (Red)", filterPage.validateSortAz());
        assertEquals("Sauce Labs Backpack", loginPage.validateBackPack());

        System.out.println("result ==== " +validateName+ " ===");
        System.out.println("result ==== " +validateFirstProduct+ " ===");
        System.out.println("result ==== " +validateLastProduct+ " ===");
    }



    @And("click price \\(low to high)")
    public void clickPriceLowToHigh() {
        filterPage.priceLowHigh();
    }



    @Then("validate filter price \\(low to high)")
    public void validateFilterPriceLowToHigh() {
        String validateName = filterPage.validateLoHi();
        String validateFirstPrice = filterPage.validatePriceLoHi();
        String validateLastPrice = filterPage.validateLastPriceLoHi();

        assertEquals("Price (low to high)", validateName);
        assertEquals("$7.99", validateFirstPrice);
        assertEquals("$49.99", validateLastPrice);

        System.out.println("Result === " +validateName+ " ===" );
        System.out.println("Result === " +validateFirstPrice+ " ===" );
        System.out.println("Result === " +validateLastPrice+ " ===" );
    }



    @Then("click price \\(high to low)")
    public void clickPriceHighToLow() {
        filterPage.priceHighLow();
    }



    @Then("validate filter price \\(high to low)")
    public void validateFilterPriceHighToLow() {
        String validateName = filterPage.getTextHiLo();
        String validateLastPrice = filterPage.validatePriceLoHi();
        String validateFirstPrice = filterPage.validateLastPriceLoHi();

        assertEquals("Price (high to low)", validateName);
        assertEquals("$49.99", validateLastPrice);
        assertEquals("$7.99", validateFirstPrice);

        System.out.println("Result === " +validateName+ " ===" );
        System.out.println("Result === " +validateLastPrice+ " ===" );
        System.out.println("Result === " +validateFirstPrice+ " ===" );
    }
}
