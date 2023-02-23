

  Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "standard_user"
    Then I fill password "secret_sauce"
    Then I click on Login
    Then Just wait 5000

 #Homework Hamburger menu, all elements
    Scenario: Click on all elements
      Given I go to "https://www.saucedemo.com/"
      Then I fill username "standard_user"
      Then I fill password "secret_sauce"
      Then I click on Login
      Then I Click on All Elements

#Homework Login with Locked_out_user and  verify error message
    Scenario: Validate Error Message for Locked User
      Given I go to "https://www.saucedemo.com/"
      Then I fill username "locked_out_user"
      Then I fill password "secret_sauce"
      Then I click on Login
      Then Just wait 5000
      Then I verify message

#Homework Select Sauce Labs Backpack and validate the button change to remove, on Products page
   Scenario: Validate REMOVE button is displayed
     Given I go to "https://www.saucedemo.com/"
     Then I fill username "standard_user"
     Then I fill password "secret_sauce"
     Then I click on Login
     Then Just wait 5000
     Then I select Sauce Back Pack
     Then I validate remove button

#Homework Select all products on the products page and go to the Cart Page
    Scenario: Validate all the Products on the Products page are added to the cart
      Given I go to "https://www.saucedemo.com/"
      Then I fill username "standard_user"
      Then I fill password "secret_sauce"
      Then I click on Login
      Then Just wait 5000
      Then I add all products to the cart
      Then Just wait 5000
      #Then I click on Cart button
      #Then I validate all products are on the cart

#Comment
    #Comment to verify




