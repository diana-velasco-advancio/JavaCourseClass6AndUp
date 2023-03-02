package Class6BDD.steps;

import Class6BDD.PO.CartProducts;
import Class6BDD.PO.ProductsPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.Then;
public class CartSteps extends DriverManager {

    CartProducts cartProducts = new CartProducts(driver);

        @Then("I validate all products are on the cart")
        public void ivalidateProductsonCart() {
            cartProducts.ValidateProducts();
        }

}
