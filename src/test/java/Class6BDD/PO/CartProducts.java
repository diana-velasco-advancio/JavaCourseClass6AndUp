package Class6BDD.PO;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CartProducts {
    private WebDriver driver;
    private WebDriverWait wait;

    public CartProducts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBys({@FindBy(className = "cart_item_label")})
    List<WebElement> ProductItem;

    List<String>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ProductName  = new ArrayList<String>();


    public void ValidateProducts() {
        if(null != ProductItem && ProductItem.size() > 0){
            for(int i = 0; i<ProductItem.size(); i++){
                WebElement Item = ProductItem.get(i);
                ProductName.add(Item.getText());
                System.out.println("Product Added: " + Item.getText() );
            }
        }
    }
}

