Feature: Shopping Cart tests

  Background: Login to Products Page
    Given Open the Saucedemo web page
    And Fill the Username field with username "standard_user"
    And Fill the Password field with password "secret_sauce"
    And Click on LOGIN button
    Then Check you are on Products Page
    And Click on shopping cart button

    Scenario: Validate that the checkout button works when having at least 1 product in shopping cart
      When Add one product to the shopping cart
      And Click on checkout button
      Then Your are redirected to Checkout page

