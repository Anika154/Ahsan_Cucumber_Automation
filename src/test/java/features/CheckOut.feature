Feature: Checkout feature

  Scenario: User try to confirm order and checkout
    Given User is on the home page
    When User hover on the book dropdown menu
    And User hover on the literature & poetry
    And User is to select the uponnash
    And User scroll down to the book
    And User click on the selected book
    And User click on the Order button
    Then User enters the Name
    And User enters Mobile Number
    And User inputs Delivery Address
    And User inputs Delivery Area
    And User click on the Confirm Order button


