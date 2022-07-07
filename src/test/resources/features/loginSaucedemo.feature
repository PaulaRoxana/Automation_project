Feature: Login tests

  Scenario Outline: Login with correct Username and correct Password

    Given Open the Saucedemo web page
       When Fill the Username field with username "<correctUsername>"
       And Fill the Password field with password "<correctPassword>"
       And Click on LOGIN button
    Then Open the Products page

    Examples:
      | correctUsername           |  correctPassword |
      | standard_user             |  secret_sauce |
      | locked_out_user           |  secret_sauce |
      | problem_user              |  secret_sauce |
      | performance_glitch_user   |  secret_sauce |



  Scenario Outline: Login with correct Username and incorrect Password

    Given Open the Saucedemo web page
    When Fill the Username field with username "<correctUsername>"
    And Fill the Password field with password "<incorrectPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct

    Examples:
      | correctUsername   |  incorrectPassword     |
      | standard_user     |  secret       |
      | locked_out_user   |  1        |

  Scenario Outline: Login with incorrect Username and correct Password

    Given Open the Saucedemo web page
    When Fill the Username field with username "<incorrectUsername>"
    And Fill the Password field with password "<correctPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct

    Examples:
      | incorrectUsername   |  correctPassword     |
      | problem           |  secret_sauce  |
      | performance       |  secret_sauce       |


  Scenario Outline: Login with incorrect Username and incorrect Password

    Given Open the Saucedemo web page
    When Fill the Username field with username "<incorrectUsername>"
    And Fill the Password field with password "<incorrectPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct

    Examples:
      | incorrectUsername   |  incorrectPassword     |
      | 1234                |  =  |
      | dgtshx              |  643w654w654w    |