Feature: HomePage feature
  Background:
    Given User is on the home page

  Scenario: User try to search the books
    When User write on the search field
    And User click on the searchBtn
    And User select the book from search list
    Then User can view the selected book details
    And User can see the reviews


#    cart
  Scenario: User try to view the Shopping Cart
    When User click on the Shopping Cart Icon
    And User can view the items on the Cart
    And User click on the Shopping Bag from Cart
    Then User can view the Shopping Cart
    And User can click on the Continue to Shopping
    And User scroll down to hover
    And User hover on the book

  Scenario: User try to cancel the Shopping Cart
    When User click on the Shopping Cart Icon
    And User can view the items on the Cart
    Then User can close the Cart

#  Wish List
  Scenario: User try to view the Wish List
    When User click on the WishList Icon
    Then User can view the items on the WishList

  Scenario: User try to check the Wish List
    When User scroll down to hover
    And User click on the book
    And User click on the WishList Icon from home
    Then User can check icon


#    footer
  Scenario: User try to Contact from footer
    When User scroll down to the page
    And User can click on the Contact Us from footer
    Then User can view the Contact page
    And User can input name
    And User can input email
    And User can input subject
    And User can input speech
    And User can click on the send Button







