Feature: Login tests

  Scenario: Login with correct Username and correct Password

    Given Open the Saucedemo web page
    When Fill the Username field with correct username
    And Fill the Password field with correct password
    And Click on LOGIN button
    Then Open the Products page

