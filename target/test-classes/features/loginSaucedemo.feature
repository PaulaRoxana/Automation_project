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



