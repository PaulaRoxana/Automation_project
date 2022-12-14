Feature: Login tests

  Background: Open page
    Given Open the Saucedemo web page

# SMOKE (HAPPY FLOW) -> 1TC

  Scenario Outline: Login with correct Username and correct Password
        When Fill the Username field with username "<correctUsername>"
    And Fill the Password field with password "<correctPassword>"
    And Click on LOGIN button
    Then Check you are on Products Page
    Examples:
      | correctUsername | correctPassword |
      | standard_user   | secret_sauce    |
     # | locked_out_user |  secret_sauce |
     # | problem_user    |  secret_sauce |

# NEGATIVE TESTING (error handling) -> 4TCs

  Scenario Outline: Login with correct Username and incorrect Password
    When Fill the Username field with username "<correctUsername>"
    And Fill the Password field with password "<incorrectPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct
    Examples:
      | correctUsername | incorrectPassword |
      | standard_user   | secret            |
      | locked_out_user | 1                 |

  Scenario Outline: Login with incorrect Username and correct Password
    When Fill the Username field with username "<incorrectUsername>"
    And Fill the Password field with password "<correctPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct
    Examples:
      | incorrectUsername | correctPassword |
      | problem           | secret_sauce    |
      | performance       | secret_sauce    |

  Scenario Outline: Login with incorrect Username and incorrect Password
    When Fill the Username field with username "<incorrectUsername>"
    And Fill the Password field with password "<incorrectPassword>"
    And Click on LOGIN button
    Then Validate the error message for incorrect Username and or Password is correct
    Examples:
      | incorrectUsername | incorrectPassword |
      | 1234              | =                 |
      | dgtshx            | 643w654w654w      |

  Scenario Outline: (Try to) login with missing Username
    When Fill the Username field with username "<missingUsername>"
    And Fill the Password field with password "<Password>"
    And Click on LOGIN button
    Then Validate the error message for missing Username is correct
    Examples:
      | missingUsername | Password     |
      |                 | =            |
      |                 | secret_sauce |

  Scenario Outline: (Try to) login with missing Password
    When Fill the Username field with username "<Username>"
    And Fill the Password field with password "<missingPassword>"
    And Click on LOGIN button
    Then Validate the error message for missing Password is correct
    Examples:
      | Username                | missingPassword |
      | performance_glitch_user |                 |
      | 123nvx                  |                 |