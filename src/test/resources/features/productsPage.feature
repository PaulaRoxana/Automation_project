Feature: Product page tests



  Scenario Outline: Click on the menu button and validate the number and the names of the options unfolded
    Given Open the Saucedemo web page
    And Fill the Username field with username "<correctUsername>"
    And Fill the Password field with password "<correctPassword>"
    And Click on LOGIN button
    Then Validate that the LOGIN button is not displayed
    And Click on the menu buton
    Then Validate that there are four options unfolded
    And Validate the names of the four options unfolded

    Examples:
      | correctUsername           |  correctPassword |
      | standard_user             |  secret_sauce |


  Scenario: Validate that the LOGOUT option is diplayed

    Scenario: Validate that when clicking on ALL ITEMS option you remain on the same page

      Scenario: Validate that when clicking on ABOUT option you are redirected to LOGIN page


  Scenario: Validate that when clicking on LOGOUT option you are redirected on an error page

  Scenario: Validate that when clicking on ALL ITEMS option you remain on the same page




