Feature: Package feature
  Background:
    Given User is on the package page

  Scenario: User try to view the Package Information
    When User select the book
    And User scroll to the details
    Then User view the book details

  Scenario: User try to select Book Types
    When User click on the BookTypes checkBox
    And User click on the selected Book Types
    And User select any book
    Then User view the selected book details

  Scenario: User try to filter Authors & Category
    When User click on the Authors checkBox
    And User click on the selected Authors
    And User view the selected authors details
    And User click on the categories checkBox
    And User click on the package
    Then User select the packageBook
    And User scroll down to the page and view details







