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
      Then You are redirected to Checkout page




