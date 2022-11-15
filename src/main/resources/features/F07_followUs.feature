@smoke
Feature: F07_followUs | User can access follow links
  Scenario: user opens facebook link
    When user clicks on facebook link
    Then user is redirected to facebook page

  Scenario: user opens twitter link
    When user clicks on twitter link
    Then user is redirected to twitter page

  Scenario: user opens rss link
    When user clicks on rss link
    Then user is redirected to rss page

  Scenario: user opens youtube link
    When user clicks on youtube link
    Then user is redirected to youtube page