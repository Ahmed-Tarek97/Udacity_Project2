@smoke
Feature: F04_Search | users could use search functionality
  Scenario Outline: user could search using product name
    When user enter product name as "<productname>"
    And user clicks on search button
    Then user is redirected to name search page
    Examples:
      | productname |
      | book |
      | laptop |
      | nike |

  Scenario Outline: user could search for product using sku
    When user enter sku as "<sku>"
    And user clicks on search button
    Then user is redirected to sku search page
    Examples:
      | sku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |