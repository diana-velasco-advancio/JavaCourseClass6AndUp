package Class6BDD.steps;

import Class6BDD.PO.LoginPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {



    LoginPo loginPo = new LoginPo(driver);


    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }
//this is a test
    //nother comnt
    @Then("I fill password {string}")
    public void iFillPassword(String stPass) {
        loginPo.fillPassword(stPass);
    }

    @Then("I click on Login")
    public void iClickOnLogin() {
        loginPo.clickLoginButton();
    }

    @Then("I verify message")
    public void iVerifyMessage(){ loginPo.readErrorMessage(); }



}
