package Class6BDD.PO;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPo {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }


    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    WebElement backpackHeaderLabel;
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerCornerButton;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItemsSideMenuButton;
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement clickSauceLabsbutton;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    WebElement RemoveButton;

    @FindBy(xpath = "//*[@class=\"inventory_list\"]")
    WebElement ProductList;

    @FindBys({ @FindBy(className = "btn_inventory")})
    List<WebElement> ProductItem;

    public void clickBurgerButton() {
        this.burgerCornerButton.click();
    }
    public void clickAllItems() {
        clickElement(allItemsSideMenuButton);
    }
    public void checkTextFirstItem(String expectedText) {Assert.assertEquals(expectedText, backpackHeaderLabel.getText()); }
    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void selectSauceLabsbutton(){
        this.clickSauceLabsbutton.click();
    }
    public void  validateRemoveLabel(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(RemoveButton));
        Assert.assertEquals("REMOVE", RemoveButton.getText());
    }

    public void AddProductsToCart(){
        if(null != ProductItem && ProductItem.size() > 0){
            for(int i = 0; i<ProductItem.size(); i++){
                WebElement buttonItem = ProductItem.get(i);
                buttonItem.click();
            }
        }

    }




}
