Feature: Login tests

  Scenario Outline: Login with correct Username and correct Password

    Given Open the Saucedemo web page
       When Fill the Username field with correct username "<username>"
       And Fill the Password field with correct password "<password>"
       And Click on LOGIN button
    Then Open the Products page

    Examples:
      | username                  |  password     |
      | standard_user             |  secret_sauce |
      | locked_out_user           |  secret_sauce |
      | problem_user              |  secret_sauce |
      | performance_glitch_user   |  secret_sauce |



  Scenario Outline: Login with incorrect Username or incorrect Password

    Given Open the Saucedemo web page
    When Fill the Username field with correct username "<username>"
    And Fill the Password field with incorrect password "<password>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username or Password is correct

    Examples:
      | username          |  password     |
      | standard_user     |  secret       |
      | locked_out_user   |  1        |
      | problem           |  secret_sauce  |
      | performance       |  secret_sauce       |
