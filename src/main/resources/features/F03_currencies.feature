@smoke
Feature: F03_currencies | users could change currency
  Scenario: user could select Euro currency from the dropdown list on the top left of home page
    When user clicks on currency dropdown list
    And user select Euro currency
    Then Euro currency is applied