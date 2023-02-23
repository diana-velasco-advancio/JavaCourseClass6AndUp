package Class6BDD.steps;

import Class6BDD.PO.ProductsPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.Then;

public class ProducSteps extends DriverManager {

    ProductsPo productsPo = new ProductsPo(driver);
    @Then("I Click on All Elements")
    public void iClickOnAllElements() {
        productsPo.clickBurgerButton();
        productsPo.clickAllItems();
    }

    @Then("I select Sauce Back Pack")
    public void iSelectSauceBackPack() {
        productsPo.selectSauceLabsbutton();
    }

    @Then("I validate remove button")
    public void iVerifyRemovebutton(){
            productsPo.validateRemoveLabel();
        }

    @Then ("I add all products to the cart")
    public void iAddAllProducts(){
            productsPo.AddProductsToCart();
    }
}

