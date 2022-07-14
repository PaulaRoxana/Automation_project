Feature: Product page tests

  Background: Login to Products Page
    Given Open the Saucedemo web page
    And Fill the Username field with username "standard_user"
    And Fill the Password field with password "secret_sauce"
    And Click on LOGIN button
    Then Check you are on Products Page

  Scenario: Click on the menu button and validate the number and the names of the options unfolded

    When Click on the menu button
    Then Validate that there are four options unfolded
         And Validate the names of the four options unfolded

  Scenario: Validate that the LOGOUT option is diplayed

    Scenario: Validate that when clicking on ALL ITEMS option you remain on the same page

      Scenario: Validate that when clicking on ABOUT option you are redirected to LOGIN page


  Scenario: Validate that when clicking on LOGOUT option you are redirected on an error page

  Scenario: Validate that when clicking on ALL ITEMS option you remain on the same page




