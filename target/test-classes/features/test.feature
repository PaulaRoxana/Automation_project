Feature: Add Cucumber framework to project

#  Comentariu pt test
  Scenario: Test for register on blog page
    Given Open Register Page

  Scenario: Validate register page has the correct title
#    Action: Open the Register Page
    When Open Register Page
    Then Validate title is correct

  Scenario: On Register Page, validate name field is mandatory
#    Registered is opened
    Given Open Register Page
    Then Validate name field is mandatory

  Scenario: On Register Page, validate all field are mandatory
#    Registered is opened
    Given Open Register Page
#    Then Validate all field are mandatory
    Then Validate name field is mandatory
    And Validate password field is mandatory
    And Validate first name field is mandatory
    And Validate last name field is mandatory

  Scenario: Example for and keyword
    When Going to the supermarket
    And Opening the door of the supermarket
    And Taking a basket
    And Adding milk to the basket
    And Going to the cash-house
    And Paying the products
    Then Check the money
    And Check the payroll
    And Check the products are out of the basket
    When Put the milk in the purse
    Then Check milk is in the purse
    And Check you are going home
