@smoke
Feature: F05_hoverCategories | User can select any subcategory
  Scenario: user can hover on a category and select subcategory
    When user hover on category "<category>"
    And user clicks on sub category "<subcategory>"
    Then user is redirected to subcategory page