Feature: Shopping Cart tests

  Background: Login to Products Page
    Given Open the Saucedemo web page
    And Fill the Username field with username "standard_user"
    And Fill the Password field with password "secret_sauce"
    And Click on LOGIN button
    Then Check you are on Products Page


  Scenario: Validate that the checkout button works when having at least 1 product added to the shopping cart
    When Add one product to the shopping cart
    And Click on shopping cart button
    And Click on checkout button
    Then Check you are redirected to Checkout page


  Scenario: Validate that when adding a number of products to the cart you find the exact same number of products into the cart
    When Add one product to the shopping cart
    And Add a second product to the shopping cart
    And Click on shopping cart button
    Then Validate that the cart contains the exact number of products added


  Scenario: Validate that the checkout button is NOT active when the shopping cart is empty
    When Click on shopping cart button
    And the shopping cart is empty
    Then Validate that checkout button is not active

