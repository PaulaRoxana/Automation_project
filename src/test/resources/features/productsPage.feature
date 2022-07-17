Feature: Product page tests

  Background: Login to Products Page
    Given Open the Saucedemo web page
    And Fill the Username field with username "standard_user"
    And Fill the Password field with password "secret_sauce"
    And Click on LOGIN button
    Then Check you are on Products Page

  # POSITIVE TESTING -> 5 TCs
  Scenario: Click on the menu button and validate the number and the names of the options unfolded
    When Click on the menu button
    Then Validate that there are four options unfolded
    And Validate the names of the four options unfolded

  Scenario: Validate that when clicking on ALL ITEMS option you remain on the same page
    When Click on the menu button
    And Click on ALL ITEMS option
    Then Check you are on Products Page

  Scenario: Validate that the LOGOUT option is diplayed
    When Click on the menu button
    Then Validate that the LOGOUT option is diplayed

  Scenario: Validate that when clicking on LOGOUT option you are redirected to LOGIN page
    When Click on the menu button
    And Click on LOGOUT option
    Then Open the Saucedemo web page

  Scenario: Validate that when clicking on RESET APP STATE option you remain on the same page
    When Click on the menu button
    And Click on RESET APP STATE option
    Then Check you are on Products Page

# NEGATIVE TESTING -> 1 TC
  Scenario: Validate that when clicking on ABOUT option you are redirected to an error page
    When Click on the menu button
    And Click on ABOUT option
    Then Check you are on an error page

